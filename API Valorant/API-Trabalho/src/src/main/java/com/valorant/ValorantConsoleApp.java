package com.valorant;

import com.valorant.model.*;
import com.valorant.service.*;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Scanner;

@Component
public class ValorantConsoleApp {

    private final AgentService agentService;
    private final WeaponService weaponService;
    private final MapService mapService;
    private final SeasonService seasonService;
    private final PlayerTitleService titleService;
    private final GameModeService gameModeService;
    private final SkinService skinService;

    public ValorantConsoleApp(AgentService agentService,
                              WeaponService weaponService,
                              MapService mapService,
                              SeasonService seasonService,
                              PlayerTitleService titleService,
                              GameModeService gameModeService,
                              SkinService skinService) {
        this.agentService = agentService;
        this.weaponService = weaponService;
        this.mapService = mapService;
        this.seasonService = seasonService;
        this.titleService = titleService;
        this.gameModeService = gameModeService;
        this.skinService = skinService;
    }

    public void exibir() {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n===== MENU VALORANT =====");
            System.out.println("1 - Agentes");
            System.out.println("2 - Armas");
            System.out.println("3 - Mapas");
            System.out.println("4 - Seasons");
            System.out.println("5 - Títulos");
            System.out.println("6 - Modos de Jogo");
            System.out.println("7 - Skins");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("\nEscolha o tipo de agente:");
                    System.out.println("1 - Duelista");
                    System.out.println("2 - Sentinela");
                    System.out.println("3 - Controlador");
                    System.out.println("4 - Iniciador");
                    System.out.print("Opção: ");
                    String tipo = sc.nextLine();
                    String role = switch (tipo) {
                        case "1" -> "Duelist";
                        case "2" -> "Sentinel";
                        case "3" -> "Controller";
                        case "4" -> "Initiator";
                        default -> null;
                    };
                    if (role != null) {
                        try {
                            List<Agent> agentes = agentService.getByRoleName(role);
                            System.out.println("\n=== AGENTES " + role.toUpperCase() + " ===");
                            for (Agent a : agentes){ System.out.println("\n" + a.displayName);
                                System.out.println("\n==== DESCRIÇÃO DO AGENTE =====");
                                System.out.println(a.description);}

                        } catch (Exception e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                }
                case "2" -> {
                    try {
                        List<Weapon> armas = weaponService.getWeapons();
                        System.out.println("\n=== ARMAS ===");
                        for (Weapon w : armas) System.out.println(w.displayName);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "3" -> {
                    try {
                        List<MapModel> mapas = mapService.getMaps();
                        System.out.println("\n=== MAPAS ===");
                        for (MapModel m : mapas) System.out.println(m.displayName);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "4" -> {
                    try {
                        List<Season> temporadas = seasonService.getSeasons();
                        System.out.println("\n=== SEASONS ===");
                        for (Season s : temporadas) {
                            System.out.println("Nome: " + s.displayName);
                            System.out.println("Início: " + s.startTime);
                            System.out.println("Fim: " + s.endTime);
                            System.out.println("------------------------");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "5" -> {
                    try {
                        List<PlayerTitle> titulos = titleService.getTitles();
                        System.out.println("\n=== TÍTULOS ===");
                        for (PlayerTitle t : titulos) System.out.println(t.displayName);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "6" -> {
                    try {
                        List<GameMode> modos = gameModeService.getGameModes();
                        System.out.println("\n=== MODOS DE JOGO ===");
                        for (GameMode gm : modos)
                            System.out.println(gm.displayName);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "7" -> {
                    try {
                        List<Skin> skins = skinService.getSkins();
                        System.out.println("\n=== SKINS ===");
                        for (Skin s : skins) System.out.println(s.displayName);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case "0" -> {
                    sair = true;
                    System.out.println("Até mais!");
                }
                default -> System.out.println("Opção inválida, tente novamente!");
            }
        }
        sc.close();
    }
}
