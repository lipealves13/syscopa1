import controllers.*;
import models.Jogador;
import models.Selecao;
import models.Tecnico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils _utils = new Utils();

		// Menu Principal
		int i = 10;
		int escolhaSelecao = 0;
		int escolhaJogador = 0;
		int escolhaArbitro = 0;
		int escolhaTecnico = 0;

		//Objetos Dao
		JogadorDao jogadorDao = new JogadorDao();
		SelecaoDao selecaoDao = new SelecaoDao();
		TecnicoDao tecnicoDao = new TecnicoDao();
		ArbitroDao arbitroDao = new ArbitroDao();

		//input
		Scanner teclado = new Scanner(System.in);

		while (i != 0) {

			System.out.println("------[̲̅<̲̅Θ̲̅>̲̅|------SysCopa------[̲̅<̲̅Θ̲̅>̲̅|------");

			System.out.println("1 - Gerenciar das Seleções");
			System.out.println("2 - Gerenciar Jogadores");
			System.out.println("3 - Gerenciar Arbitros");
			System.out.println("4 - Gerenciar Técnicos");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.print("Digite o número da opção: ");

			i = teclado.nextInt();
			_utils.limpatela();
			if (i < 5 && i >= 0) {
				switch (i) {
				case 1:
					System.out.println("------------Selecoes------------");
					System.out.println("1 - Cadastrar Seleção");
					System.out.println("2 - Editar Seleção");
					System.out.println("3 - Excluir Seleção");
					System.out.println("4 - Listar Seleções");
					System.out.print("Digite o número da opção: ");
					escolhaSelecao = teclado.nextInt();
					_utils.limpatela();

					switch (escolhaSelecao) {
					case 1:

						System.out.println("1 - Cadastrar Seleção");
						System.out.println("Digite a nacionalidade");
						String nacionalidadeSelecao = teclado.next();
						System.out.println("Digite o grupo");
						String grupoSelecao = teclado.next();
						Selecao selecao = new Selecao();

						selecao.setGrupo(grupoSelecao);
						selecao.setNacionalidade(nacionalidadeSelecao);
						selecao.setJogadores(jogadorDao.buscaJogadorNacionalidade(nacionalidadeSelecao));
						selecao.setTecnico(tecnicoDao.buscaTecnicoNacionalidade(nacionalidadeSelecao));
						selecaoDao.save(selecao);





						continue;

					case 2:
						System.out.println("2 - Editar Seleção");
						continue;

					case 3:
						System.out.println("3 - Excluir Seleção");
						continue;

					case 4:
						System.out.println("4 - Listar Seleções");
						Selecao selecaoBuscada = new Selecao();
						System.out.println("Digite a nacionalidade: ");
						selecaoBuscada = selecaoDao.buscaSelecao(teclado.next());

						System.out.print("Nacionalidade: ");
						System.out.println(selecaoBuscada.getNacionalidade());
						System.out.println("Jogadores: ");
						for(int indexSelecao=0; selecaoBuscada.getJogadores().size()>indexSelecao;indexSelecao++){
							System.out.println(selecaoBuscada.getJogadores().get(indexSelecao).getNome());
						}
						System.out.print("Tecnico: ");
						System.out.println(selecaoBuscada.getTecnico().getNome());

						continue;

					default:
						_utils.opcaoInvalida();
						continue;
					}


				case 2:
					System.out.println("------------Jogadores------------");
					System.out.println("1 - Cadastrar Jogador");
					System.out.println("2 - Editar Jogador");
					System.out.println("3 - Excluir Jogador");
					System.out.println("4 - Listar Jogadores");
					System.out.print("Digite o número da opção: ");
					escolhaJogador = teclado.nextInt();
					_utils.limpatela();

					switch (escolhaJogador) {
					case 1:
						System.out.println("1 - Cadastrar Jogador");

						System.out.println("Digite o nome: ");
						String nome = teclado.next();
						System.out.println("Digite o nacionalidade: ");
						String nacionalidade = teclado.next();
						System.out.println("Digite o Numero da camisa: ");
						int numeroCamisa = teclado.nextInt();
						System.out.println("Digite o posição: ");
						String posicao = teclado.next();
						System.out.println("Digite a quantidade de catões amarelos: ");
						int cartoesAmarelos = teclado.nextInt();
						System.out.println("Digite a quantidade de catões Vermelhos: ");
						int cartoesVermelhos = teclado.nextInt();
						System.out.println("Digite a quantidade de gols marcados: ");
						int golsMarcados = teclado.nextInt();

						Jogador jogador = new Jogador();
						jogador.setNome(nome);
						jogador.setNacionalidade(nacionalidade);
						jogador.setNumeroDaCamisa(numeroCamisa);
						jogador.setPosicao(posicao);
						jogador.setCartoesAmarelos(cartoesAmarelos);
						jogador.setCartoesVermelhos(cartoesVermelhos);
						jogador.setGolsMarcados(golsMarcados);
						jogador.setCodJogador(nacionalidade+numeroCamisa);
						jogadorDao.save(jogador);

						continue;

					case 2:
						System.out.println("2 - Editar Jogador");



						continue;

					case 3:
						System.out.println("3 - Excluir Jogador");
						continue;

					case 4:
						Jogador jogadorBuscado = new Jogador();
						System.out.println("4 - Listar Jogador");
						System.out.println("Digite o código do jogador (Nacionalidade + Numero da camisa): ");
						jogadorBuscado = jogadorDao.buscaJogadorCod(teclado.next());
						System.out.println(jogadorBuscado.getNome());
						System.out.println(jogadorBuscado.getPosicao());
						System.out.println(jogadorBuscado.getNacionalidade());
						System.out.println(jogadorBuscado.getNumeroDaCamisa());
						System.out.println(jogadorBuscado.getCartoesAmarelos());
						System.out.println(jogadorBuscado.getCartoesVermelhos());
						System.out.println(jogadorBuscado.getGolsMarcados());



						continue;

					default:
						_utils.opcaoInvalida();
						continue;
					}

				case 3:
					System.out.println("------------Arbitros------------");
					System.out.println("1 - Cadastrar Arbitro");
					System.out.println("2 - Editar Arbitro");
					System.out.println("3 - Excluir Arbitro");
					System.out.println("4 - Listar Arbitros");
					System.out.print("Digite o número da opção: ");
					escolhaArbitro = teclado.nextInt();
					_utils.limpatela();

					switch (escolhaArbitro) {
					case 1:
						System.out.println("1 - Cadastrar Arbitro");
						continue;

					case 2:
						System.out.println("2 - Editar Arbitro");
						continue;

					case 3:
						System.out.println("3 - Excluir Arbitro");
						continue;

					case 4:
						System.out.println("4 - Listar Arbitros");
						continue;

					default:
						_utils.opcaoInvalida();
						continue;
					}

				case 4:
					System.out.println("------------Tecnicos------------");
					System.out.println("1 - Cadastrar Tecnico");
					System.out.println("2 - Editar Tecnico");
					System.out.println("3 - Excluir Tecnico");
					System.out.println("4 - Listar Tecnicos");
					System.out.print("Digite o número da opção: ");
					escolhaTecnico = teclado.nextInt();
					_utils.limpatela();

					switch (escolhaTecnico) {
					case 1:
						System.out.println("1 - Cadastrar Tecnico");
						System.out.println("Digite o nome do tecnico: ");
						String Nome = teclado.next();
						System.out.println("Digite a nacionalidade: ");
						String Nacionalidade = teclado.next();

						Tecnico tecnico = new Tecnico();
						tecnico.setNome(Nome);
						tecnico.setNacionalidade(Nacionalidade);
						tecnicoDao.save(tecnico);
						continue;

					case 2:
						System.out.println("2 - Editar Tecnico");
						continue;

					case 3:
						System.out.println("3 - Excluir Tecnico");
						continue;

					case 4:
						System.out.println("4 - Listar Tecnico");
						continue;

					default:
						_utils.opcaoInvalida();
						continue;
					}


				case 0:
					_utils.limpatela();
					System.out.println("Até mais!");
					continue;
				}

			} else

			{
				_utils.limpatela();
				_utils.opcaoInvalida();
			}
			i = 10;

		}
		teclado.close();
	}

}
