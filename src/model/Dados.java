package model;

import controller.FilmeCTR;
import controller.Locflix;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

import java.math.BigDecimal;

/**
 * Created by Amanda on 14/10/2017.
 */
public class Dados {

    private Button btnLista_filmes;

    public void preencheDados(Button btnLista_filmes) {
        this.btnLista_filmes = btnLista_filmes;

        Filme filme;
        FilmeCTR filmeCTR;


        ////// FILMES LANÇAMENTOS //////

        filme = new Filme();
        filme.setFilmeId(1);
        filme.setNome("Atômica");
        filme.setSinopse("Lorraine Broughton (Charlize Theron), uma agente disfarçada do MI6, é enviada para Berlim durante a Guerra Fria para investigar o assassinato de um oficial e recuperar uma lista perdida de agentes duplos. Ao lado de David Percival (James McAvoy), chefe da localidade, a assassina brutal usará todas as suas habilidades nesse confronto de espiões.");
        filme.setDataLancamento("31/08/2017");
        filme.setDuracao("1h 55m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/atomica_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/atomica_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(2);
        filme.setNome("Intolerância.doc");
        filme.setSinopse("O que motiva os crimes de ódio e a intolerância dentro da sociedade brasileira? Esta pergunta, ainda sem resposta definitiva, ganha cada vez mais importância conforme novas notícias e acontecimentos surgem, provando que o Brasil pode não ser um país formado apesar de suas contradições e por causa de suas misturas, mas sim um país formado com base na intolerância em relação às suas misturas.");
        filme.setDataLancamento("17/08/2017");
        filme.setDuracao("1h 25m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/lancamento/intolerancia_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/intolerancia_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(3);
        filme.setNome("Emoji: O Filme");
        filme.setSinopse("Textopolis é a cidade onde os Emojis favoritos dos usuários de smartphones vivem e trabalham. Lá, todos eles vivem em função de um sonho: serem usados nos textos dos humanos. Todos estão acostumados a ter somente uma expressão facial - com exceção de Gene, que nasceu com um bug em seu sistema, que o permite trocar de rosto através de um filtro especial. Determinado à se tornar um emoji normal como todos os outros, eles vai encarar uma jornada fantásticas através dos aplicativos de celular mais populares desta geração - e no meio do caminho, claro, fazer novos amigos.");
        filme.setDataLancamento("31/08/2017");
        filme.setDuracao("1h 26m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/emoji_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/emoji_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(4);
        filme.setNome("Dupla Explosiva");
        filme.setSinopse("O principal guarda-costas do mundo possui um novo cliente: um assassino de aluguel que precisa testemunhar na Corte Internacional de Justiça. Por anos eles estavam em lados opostos de um tiro, mas agora eles estão presos juntos. Eles precisam colocar as diferenças de lado para chegarem ao julgamento a tempo.");
        filme.setDataLancamento("31/08/2017");
        filme.setDuracao("1h 58m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/dupla_explosiva_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/dupla_explosiva_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(5);
        filme.setNome("A Torre Negra");
        filme.setSinopse("Um pistoleiro chamado Roland Deschain (Idris Elba) percorre o mundo em busca da famosa Torre Negra, prédio mágico que está prestes a desaparecer. Essa busca envolve uma intensa perseguição ao poderoso Homem de Preto (Matthew McConaughey), passagens entre tempos diferentes, encontros intensos e confusões entre o real e o imaginário. Baseado na obra literária homônima de Stephen King.");
        filme.setDataLancamento("24/08/2017");
        filme.setDuracao("1h 35m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/torre_negra_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/torre_negra_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(6);
        filme.setNome("Annabelle 2 - A criação do mal");
        filme.setSinopse("Anos após a trágica morte de sua filha, um habilidoso artesão de bonecas e sua esposa decidem, por caridade, acolher em sua casa uma freira e dezenas de meninas desalojadas de um orfanato. Atormentado pelas lembranças traumáticas, o casal ainda precisa lidar com um amendrontador demônio do passado: Annabelle, criação do artesão.");
        filme.setDataLancamento("17/08/2017");
        filme.setDuracao("1h 50m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("6.9"));
        filme.setCapaMenor(new Image("view/images/lancamento/annabelle2_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/annabelle2_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(7);
        filme.setNome("It - A coisa");
        filme.setSinopse("Um grupo de sete adolescentes de Derry, uma cidade no Maine, formam o auto-intitulado \"Losers Club\" - o clube dos perdedores. A pacata rotina da cidade é abalada quando crianças começam a desaparecer e tudo o que pode ser encontrado delas são partes de seus corpos. Logo, os integrantes do \"Losers Club\" acabam ficando face a face com o responsável pelos crimes: o palhaço Pennywise.");
        filme.setDataLancamento("07/09/2017");
        filme.setDuracao("2h 15m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("6.9"));
        filme.setCapaMenor(new Image("view/images/lancamento/it_a_coisa_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/it_a_coisa_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(8);
        filme.setNome("Polícia Federal - A lei é para todos");
        filme.setSinopse("Do início do processo até a condução coercitiva do ex-presidente Lula, a Operação Lava Jato desencadeia uma série de investigações sobre a corrupção no Brasil.");
        filme.setDataLancamento("07/09/2017");
        filme.setDuracao("1h 47m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/lancamento/policia_federal_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/policia_federal_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(9);
        filme.setNome("Lino - Uma aventura de sete vidas");
        filme.setSinopse("Lino trabalha como animador de festas, mas não aguenta mais ter que suportar todos os maus tratos feitos pelas crianças, que zombam dele por trabalhar com uma ridícula fantasia de gato gigante. Determinado a mudar sua vida, ele contrata os serviços de um feiticeiro, mas, inesperadamente, a magia acaba sendo um tiro no pé e Lino se transforma justamente em um felino enorme.");
        filme.setDataLancamento("07/09/2017");
        filme.setDuracao("1h 33m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/lino_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/lino_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(10);
        filme.setNome("Os meninos que enganavam nazistas");
        filme.setSinopse("Durante um período de ocupação nazista na França, os jovens irmãos judeus Maurice (Batyste Fleurial) e Joseph (Dorian Le Clech) embarcam em uma aventura para escapar dos nazistas. Em meio a invasão e a perseguição, eles se monstram espertos, corajosos e inteligentes em sua escapada, tudo com o objetivo de reunir a família mais uma vez.");
        filme.setDataLancamento("03/08/2017");
        filme.setDuracao("1h 54m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/lancamento/meninos_que_enganavam_nazistas_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/lancamento/meninos_que_enganavam_nazistas_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES AÇÃO //////

        filme = new Filme();
        filme.setFilmeId(11);
        filme.setNome("O Turista");
        filme.setSinopse("Durante uma viagem improvisada à Europa para curar um coração partido, o professor de matemática Frank Tupelo se vê em uma situação extraordinária quando uma estranha sedutora, Elise, cruza seu caminho. A paquera aparentemente inocente se transforma em um perigoso jogo de gato e rato.");
        filme.setDataLancamento("21/01/2011");
        filme.setDuracao("1h 43m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/acao/o_turista_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/o_turista_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(12);
        filme.setNome("Velozes e Fusiosos 7");
        filme.setSinopse("Após os acontecimentos em Londres, Dom (Vin Diesel), Brian (Paul Walker), Letty (Michelle Rodriguez) e o resto da equipe tiveram a chance de voltar para os Estados Unidos e recomeçarem suas vidas. Mas a tranquilidade do grupo é destruída quando Deckard Shaw (Jason Statham), um assassino profissional, quer vingança pela morte de seu irmão. Agora, a equipe tem que se reunir para impedir este novo vilão. Mas dessa vez, não é só sobre ser veloz. A luta é pela sobrevivência.");
        filme.setDataLancamento("02/04/2015");
        filme.setDuracao("2h 17m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/acao/velozes_furiosos_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/velozes_furiosos_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(13);
        filme.setNome("Batman - O Cavaleiro das Trevas");
        filme.setSinopse("Após dois anos desde o surgimento do Batman (Christian Bale), os criminosos de Gotham City têm muito o que temer. Com a ajuda do tenente James Gordon (Gary Oldman) e do promotor público Harvey Dent (Aaron Eckhart), Batman luta contra o crime organizado. Acuados com o combate, os chefes do crime aceitam a proposta feita pelo Coringa (Heath Ledger) e o contratam para combater o Homem-Morcego.");
        filme.setDataLancamento("18/07/2008");
        filme.setDuracao("2h 27m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/acao/batman_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/batman_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(14);
        filme.setNome("Piratas do Caribe - A vingança de Salazar");
        filme.setSinopse("O capitão Salazar (Javier Bardem) é a nova pedra no sapato do capitão Jack Sparrow (Johnny Depp). Ele lidera um exército de piratas fantasmas assassinos e está disposto a matar todos os piratas existentes na face da Terra. Para escapar, Sparrow precisa encontrar o Tridente de Poseidon, que dá ao seu dono o poder de controlar o mar.");
        filme.setDataLancamento("25/05/2017");
        filme.setDuracao("2h 09m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/acao/piratas_do_caribe_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/piratas_do_caribe_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(15);
        filme.setNome("Os Vingadores");
        filme.setSinopse("Loki retorna à Terra enviado por uma raça alienígena que pretende dominar os humanos. Com a promessa de que será o soberano do planeta, ele rouba o cubo cósmico de dentro das instalações da S.H.I.E.L.D. e adquire grandes poderes.");
        filme.setDataLancamento("27/04/2012");
        filme.setDuracao("2h 23m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/acao/os_vingadores_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/os_vingadores_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(16);
        filme.setNome("Gladiador");
        filme.setSinopse("Nos dias finais do reinado de Marcus Aurelius (Richard Harris), o imperador desperta a ira de seu filho Commodus (Joaquin Phoenix) ao tornar pública sua predileção em deixar o trono para Maximus (Russell Crowe), o comandante do exército romano. Sedento pelo poder, Commodus mata seu pai, assume a coroa e ordena a morte de Maximus, que consegue fugir antes de ser pego e passa a se esconder sob a identidade de um escravo e gladiador do Império Romano.");
        filme.setDataLancamento("19/05/2000");
        filme.setDuracao("2h 35m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/acao/gladiador_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/gladiador_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(17);
        filme.setNome("Homem Aranha - De volta ao lar");
        filme.setSinopse("Depois de atuar ao lado dos Vingadores, chegou a hora do pequeno Peter Parker (Tom Holland) voltar para casa e para a sua vida, já não mais tão normal. Lutando diariamente contra pequenos crimes nas redondezas, ele pensa ter encontrado a missão de sua vida quando o terrível vilão Abutre (Michael Keaton) surge amedrontando a cidade. O problema é que a tarefa não será tão fácil como ele imaginava.");
        filme.setDataLancamento("06/07/2017");
        filme.setDuracao("2h 14m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/acao/homem_aranha_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/homem_aranha_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(18);
        filme.setNome("DeadPool");
        filme.setSinopse("Ex-militar e mercenário, Wade Wilson (Ryan Reynolds) é diagnosticado com câncer em estado terminal, porém encontra uma possibilidade de cura em uma sinistra experiência científica. Recuperado, com poderes e um incomum senso de humor, ele torna-se Deadpool e busca vingança contra o homem que destruiu sua vida.");
        filme.setDataLancamento("11/02/2016");
        filme.setDuracao("1h 48m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/acao/deadpool_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/deadpool_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(19);
        filme.setNome("Esquadrão Suicida");
        filme.setSinopse("Um time dos mais perigosos e encarcerados supervilões são contratados por uma agência secreta do governo, para combater uma poderosa entidade. No entanto, quando eles percebem que não foram escolhidos apenas para ter sucesso, mas também por sua óbvia culpa quando inevitavelmente falharem, terão que decidir se vale a pena ou não continuar correndo risco de morte.");
        filme.setDataLancamento("04/08/2016");
        filme.setDuracao("2h 03m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("4.5"));
        filme.setCapaMenor(new Image("view/images/acao/esquadrao_suicida_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/esquadrao_suicida_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(20);
        filme.setNome("007 - Operação Skyfall");
        filme.setSinopse("Após uma missão mal sucedida de James Bond, a identidade de agentes secretos é revelada e o M16, atacado. Ajudado por um agente de campo, Bond deverá seguir a trilha de Silva, um homem que habita o passado de M e que tem contas a acertar.");
        filme.setDataLancamento("26/10/2012");
        filme.setDuracao("2h 23m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("4.5"));
        filme.setCapaMenor(new Image("view/images/acao/007_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/acao/007_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES COMÉDIA //////

        filme = new Filme();
        filme.setFilmeId(21);
        filme.setNome("Encontro Explosivo");
        filme.setSinopse("Roy Miller (Tom Cruise) é um agente que guarda consigo uma bateria especial, que jamais descarrega. O objeto é cobiçado pelo governo dos Estados Unidos, que enviou o agente Fitzgerald (Peter Sarsgaard) para obtê-lo, e Antonio (Jordi Mollà), um perigoso bandido espanhol. No aeroporto Miller usa June Havens (Cameron Diaz) para passar a bateria pela alfândega. June deseja apenas chegar o quanto antes para participar do casamento de sua irmã e, devido à pressa, consegue transferir seu voo para o mesmo de Miller. Só que no voo estão vários agentes destacados para eliminar Miller e recuperar a bateria, a qualquer custo.");
        filme.setDataLancamento("16/07/2010");
        filme.setDuracao("1h 40m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/comedia/encontro_explosivo_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/encontro_explosivo_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(22);
        filme.setNome("Jogo de Amor em Las Vegas");
        filme.setSinopse("Após ser dispensada por seu noivo, Joy McNally (Cameron Diaz) decide chorar as mágoas em Las Vegas. Lá ela conhece Jack Fuller (Ashton Kutcher), que foi demitido por seu próprio pai (Jack Fuller Sr.). Após uma noite de diversão e bebedeira, eles acordam descobrindo que se casaram. Antes de se separarem eles apostam uma moeda em um caça-níquel, ganhando US$ 3 milhões. Só que para ficar com o dinheiro eles precisam provar que são um casal estável, o que os obriga a morar juntos.");
        filme.setDataLancamento("27/06/2008");
        filme.setDuracao("1h 40m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/jogo_amor_las_vegas_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/jogo_amor_las_vegas_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(23);
        filme.setNome("Os Simpsons: O Filme");
        filme.setSinopse("Homer Simpson polui o lago de Springfield e acaba causando sérios danos para a cidade. Para amenizar o problema, a solução é colocar toda a cidade dentro de uma bolha, se isolando do resto do mundo.");
        filme.setDataLancamento("17/08/2007");
        filme.setDuracao("1h 30m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/os_simpsons_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/os_simpsons_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(24);
        filme.setNome("Homens de Preto");
        filme.setSinopse("Agência secreta governamental cuida de fiscalizar os alienígenas que já vivem na Terra, sendo que alguns são vigiados em tempo integral. James Edwards (Will Smith), um novato na organização, em parceria de K (Tommy Lee Jones), um veterano agente, tenta impedir um terrorista intergalático, que planeja assassinar dois representantes de galáxias opostas e destruir o planeta Terra.");
        filme.setDataLancamento("11/07/1997");
        filme.setDuracao("1h 38m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/homens_preto_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/homens_preto_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(25);
        filme.setNome("Hitch - Conselheiro Amoroso");
        filme.setSinopse("Alex Hitch (Will Smith) é um lendário, e propositalmente anônimo, \"doutor do amor\", que vive em Nova York. Em troca de uma determinada taxa, ele se dispõe a ajudar homens a conquistar as mulheres de seus sonhos. Enquanto trabalha para Albert (Kevin James), um contador que se apaixonou pela socialite Allegra Cole (Amber Valetta), Hitch conhece a mulher que acredita ser sua própria cara-metade: a jornalista Sara Melas (Eva Mendes). Apaixonado, Hitch decide conquistá-la mesmo correndo o risco de ter sua identidade desvendada pelo jornal em que Sara trabalha.");
        filme.setDataLancamento("18/02/2005");
        filme.setDuracao("1h 58m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/hitch_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/hitch_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(26);
        filme.setNome("As Loucuras de Dick e Jane");
        filme.setSinopse("Dick (Jim Carrey) e Jane (Téa Leoni) formam um casal que vive confortavelmente, até ele ser demitido. As dívidas se acumulam cada vez, deixando-os em estado caótico. Para manter o padrão de vida que levavam eles decidem realizar pequenos roubos. Após um início cheio de problemas, eles se vêem diante do golpe que pode deixá-los milionários.");
        filme.setDataLancamento("20/01/2006");
        filme.setDuracao("1h 30m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/as_loucuras_dick_jane_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/as_loucuras_dick_jane_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(27);
        filme.setNome("Se beber, não case!");
        filme.setSinopse("Dois dias antes de seu casamento, Doug e três amigos vão de carro para Las Vegas para uma louca e memorável despedida de solteiro. Na verdade, quando os três padrinhos acordam na manhã seguinte, eles não podem lembrar de nada e nem podem encontrar Doug. Com pouco tempo de sobra, os três amigos tentam retraçar seus passos e encontrar Doug para que possam levá-lo de volta a Los Angeles a tempo de caminhar até o altar.");
        filme.setDataLancamento("21/08/2009");
        filme.setDuracao("1h 40m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4.5"));
        filme.setCapaMenor(new Image("view/images/comedia/se_beber_nao_case_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/se_beber_nao_case_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(28);
        filme.setNome("American Pie - O Reencontro");
        filme.setSinopse("Para comemorar dez anos de formatura do ensino médio, os personagens da série \"American Pie\" se reúnem em East Great Falls, Michigan, durante um fim de semana. Cada um deles vive um momento diferente, no entanto, alguns hábitos nunca mudam.");
        filme.setDataLancamento("20/04/2012");
        filme.setDuracao("1h 54m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/comedia/american_pie_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/american_pie_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(29);
        filme.setNome("Click");
        filme.setSinopse("Um arquiteto, casado e com filhos, está cada vez mais frustrado por passar a maior parte de seu tempo trabalhando. Um dia, ele encontra um inventor excêntrico que lhe dá um controle remoto universal, com capacidade de acelerar o tempo. No início, ele usa o aparelho para acelerar qualquer momento tedioso, mas se dá conta de que está acelerando o tempo demais, deixando de viver preciosos momentos em família. Desesperado, ele procura o inventor para ajudá-lo a reverter o que fez.");
        filme.setDataLancamento("11/08/2006");
        filme.setDuracao("1h 47m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/comedia/click_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/click_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(30);
        filme.setNome("A Era do Gelo: O Big Bang");
        filme.setSinopse("Depois que o esquilo Scrat, involuntariamente, provoca um acidente espacial em sua incansável perseguição pela noz, um enorme meteoro entra em rota de colisão com a Terra, ameaçando o lar de Manny, Diego, Sid e cia. Sem saber o que fazer para reverter a situação, eles terão que confiar em Buck, a elétrica doninha caolha do terceiro filme – único do grupo que realmente tem um plano para evitar o trágico fim de todos. Paralelamente, Mannie e Ellie têm que lidar com iminente saída de Amora de casa, ao passo que Diego e Shira pensam em aumentar a família e Sid finalmente parece encontrar o amor.");
        filme.setDataLancamento("07/07/2016");
        filme.setDuracao("1h 34m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("4.5"));
        filme.setCapaMenor(new Image("view/images/comedia/era_do_gelo_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/comedia/era_do_gelo_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES DOCUMENTÁRIOS //////

        filme = new Filme();
        filme.setFilmeId(31);
        filme.setNome("Deep Web");
        filme.setSinopse("William Ross Ulbricht é um empresário de 30 anos que foi preso. Sob o pseudônimo de \"Dread Pirate Roberts\", ele fomentou o mercado negro online de drogas. A família Ulbricht fala sobre o jovem que, com um pensamento empreendedor e de liderença, conseguiu atingir este mercado digitalmente.");
        filme.setDataLancamento("15/03/2015");
        filme.setDuracao("1h 29m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/documentario/deep_web_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/deep_web_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(32);
        filme.setNome("Mamonas Pra Sempre");
        filme.setSinopse("A história de Bento, Dinho, Júlio, Samuel e Sérgio, que iniciaram na música através da banda Utopia e atingiram a fama nacional com o grupo Mamonas Assassinas. Uma história de sucesso que chegou ao fim devido a um trágico acidente aéreo, ocorrido em 2 de março de 1996.");
        filme.setDataLancamento("17/06/2011");
        filme.setDuracao("1h 23m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/documentario/mamonas_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/mamonas_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(33);
        filme.setNome("Steve Jobs - O homem e a máquina");
        filme.setSinopse("O documentário examina a vida e o legado de Steve Jobs, reverenciado por muitos como um gênio ou como tirano. Usando entrevistas com pessoas próximas a ele em diferentes fases da vida, há uma busca de capturar a essência de Steve Jobs e os valores dele que moldaram a culltura do Vale do Silício.");
        filme.setDataLancamento("02/02/2016");
        filme.setDuracao("2h 03m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/documentario/steve_jobs_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/steve_jobs_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(34);
        filme.setNome("Senna");
        filme.setSinopse("Junho de 1984, GP de Mônaco de Fórmula 1. Seis atuais ou futuros campeões mundiais estavam na pista, mas as atenções ficaram voltadas para um jovem que largara em 13º lugar e estava apenas em sua sexta corrida. Ultrapassando um a um, ele alcançou seu primeiro pódio e apenas não venceu devido a uma questão técnica. Seu nome era Ayrton Senna. A trajetória do tricampeão mundial, contada desde a ascensão no automobilismo até sua morte em pleno GP de San Marino, em 1994, passando pela rivalidade com Alain Prost e os problemas enfrentados nos bastidores da Fórmula 1.");
        filme.setDataLancamento("12/11/2010");
        filme.setDuracao("1h 44m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/documentario/senna_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/senna_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(35);
        filme.setNome("Cobain - Montage of heck");
        filme.setSinopse("Documentário sobre o vocalista, guitarrista e compositor Kurt Cobain, líder do Nirvana. Com acesso a arquivos pessoais e depoimentos de familiares de Cobain - inclusive com a participação da filha dele com Courtney Love, o filme conta do início até a ascensão de sua carreira, apresentando diversas canções, algumas delas inéditas. O retrato íntimo de um artista que raramente se revelou para a mídia.");
        filme.setDataLancamento("18/06/2015");
        filme.setDuracao("2h 12m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/documentario/cobain_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/cobain_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(36);
        filme.setNome("Jackass 3D");
        filme.setSinopse("Johnny Knoxville e os seus excêntricos amigos voltam em filme, para coisas que ninguém os deixaria fazer na popular e controversa série da MTV, arriscando estranhas e dolorosas performances e até a própria vida, desde aterrorizar japoneses disfarçados de pandas, passando por corridas em carros de golfe, caminhando em uma corda por cima de crocodilos vivos!");
        filme.setDataLancamento("12/11/2010");
        filme.setDuracao("1h 16m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_18.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/documentario/jackass_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/jackass_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(37);
        filme.setNome("Fahrenheit 11 de Setembro");
        filme.setSinopse("O diretor Michael Moore investiga como os Estados Unidos se tornaram alvo de terroristas, a partir dos eventos ocorridos no atentado de 11 de setembro de 2001. Os paralelos entre as duas gerações da família Bush que já comandaram o país e ainda as relações entre George W. Bush e Osama Bin Laden.");
        filme.setDataLancamento("30/07/2004");
        filme.setDuracao("1h 50m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/documentario/fahrenheit_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/fahrenheit_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(38);
        filme.setNome("O começo da vida");
        filme.setSinopse("Uma análise aprofundada e um retrato apaixonado sobre os primeiros mil dias de um recém-nascido, o verdadeiro começo da vida de um ser humano, tempo considerado crucial pós-nascimento para o desenvolvimento saudável da criança, tanto na infância quanto na vida adulta, onde os pais precisam ter o maior cuidado, amor e carinho possível.");
        filme.setDataLancamento("05/05/2016");
        filme.setDuracao("1h 37m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/documentario/comeco_da_vida_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/comeco_da_vida_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(39);
        filme.setNome("O dia que durou 21 anos");
        filme.setSinopse("Este documentário mostra a influência do governo dos Estados Unidos no Golpe de Estado no Brasil em 1964. A ação militar que deu início a ditadura contou com a ativa participação de agências como CIA e a própria Casa Branca. Com documentos secretos e gravações originais da época, o filme mostra como os presidentes John F. Kennedy e Lyndon Johnson se organizaram para tirar o presidente João Goulart do poder e apoiar o governo do marechal Humberto Castelo Branco.");
        filme.setDataLancamento("29/03/2013");
        filme.setDuracao("1h 17m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/documentario/dia_que_durou_21_anos_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/dia_que_durou_21_anos_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(40);
        filme.setNome("Video Games: The Movie");
        filme.setSinopse("Do Atari ao Xbox, este documentário com elenco estelar explora a história dos jogos, sua influência e a evolução dessa indústria multibilionária.");
        filme.setDataLancamento("15/07/2014");
        filme.setDuracao("1h 45m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/documentario/video_games_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/documentario/video_games_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES DRAMA //////

        filme = new Filme();
        filme.setFilmeId(41);
        filme.setNome("A Teoria de Tudo");
        filme.setSinopse("Baseado na biografia de Stephen Hawking, o filme mostra como o jovem astrofísico (Eddie Redmayne) fez descobertas importantes sobre o tempo, além de retratar o seu romance com a aluna de Cambridge Jane Wide (Felicity Jones) e a descoberta de uma doença motora degenerativa quando tinha apenas 21 anos.");
        filme.setDataLancamento("29/01/2015");
        filme.setDuracao("2h 03m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/drama/teoria_de_tudo_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/teoria_de_tudo_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(42);
        filme.setNome("Sempre ao seu lado");
        filme.setSinopse("Parker Wilson (Richard Gere) é um professor universitário que, ao retornar do trabalho, encontra na estação de trem um filhote de cachorro da raça akita, conhecido por sua lealdade. Sem ter como deixá-lo na estação, Parker o leva para casa mesmo sabendo que Cate (Joan Allen), sua esposa, é contra a presença de um cachorro. Aos poucos Parker se afeiçoa ao filhote, que tem o nome Hachi escrito na coleira, em japonês. Cate cede e aceita sua permanência. Hachi cresce e passa a acompanhar Parker até a estação de trem, retornando ao local no horário em que o professor está de volta. Até que um acontecimento inesperado altera sua vida.");
        filme.setDataLancamento("25/12/2009");
        filme.setDuracao("1h 33m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/drama/sempre_ao_seu_lado_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/sempre_ao_seu_lado_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(43);
        filme.setNome("Invencível");
        filme.setSinopse("O drama retrata a história real do atleta olímpico Louis Zamperini (Jack O'Connell), que sofre um acidente de avião e cai em pleno mar. Ele luta durante 47 dias para reencontrar a terra firme e quando consegue é capturado pelos japoneses em plena Segunda Guerra Mundial.");
        filme.setDataLancamento("15/01/2015");
        filme.setDuracao("2h 17m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4.9"));
        filme.setCapaMenor(new Image("view/images/drama/invencivel_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/invencivel_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(44);
        filme.setNome("Uma Mente Brilhante");
        filme.setSinopse("John Nash (Russell Crowe) é um gênio da matemática que, aos 21 anos, formulou um teorema que provou sua genialidade e o tornou aclamado no meio onde atuava. Mas aos poucos o belo e arrogante Nash se transforma em um sofrido e atormentado homem, que chega até mesmo a ser diagnosticado como esquizofrênico pelos médicos que o tratam. Porém, após anos de luta para se recuperar, ele consegue retornar à sociedade e acaba sendo premiado com o Nobel.");
        filme.setDataLancamento("15/02/2002");
        filme.setDuracao("2h 14m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/drama/uma_mente_brilhante_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/uma_mente_brilhante_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(45);
        filme.setNome("Dunkirk");
        filme.setSinopse("Na Operação Dínamo, mais conhecida como a Evacuação de Dunquerque, soldados aliados da Bélgica, do Império Britânico e da França são rodeados pelo exército alemão e devem ser resgatados durante uma feroz batalha no início da Segunda Guerra Mundial. A história acompanha três momentos distintos: uma hora de confronto no céu, onde o piloto Farrier (Tom Hardy) precisa destruir um avião inimigo, um dia inteiro em alto mar, onde o civil britânico Dawson (Mark Rylance) leva seu barco de passeio para ajudar a resgatar o exército de seu país, e uma semana na praia, onde o jovem soldado Tommy (Fionn Whitehead) busca escapar a qualquer preço.");
        filme.setDataLancamento("27/07/2017");
        filme.setDuracao("1h 47m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/drama/dunkirk_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/dunkirk_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(46);
        filme.setNome("O jogo da imitação");
        filme.setSinopse("Em 1939, a recém-criada agência de inteligência britânica MI6 recruta Alan Turing, um aluno da Universidade de Cambridge, para quebrar códigos nazistas, incluindo o \"Enigma\", que criptógrafos acreditavam ser inquebrável. A equipe de Turing, incluindo Joan Clarke, analisa as mensagens de \"Enigma\", enquanto ele constrói uma máquina para decifrá-las. Após desvendar as codificações, Turing se torna herói. Porém, em 1952, autoridades revelam que ele é gay e sua vida vira um pesadelo.");
        filme.setDataLancamento("05/02/2015");
        filme.setDuracao("1h 55m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/drama/jogo_da_imitacao_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/jogo_da_imitacao_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(47);
        filme.setNome("Jobs");
        filme.setSinopse("De hippie sem foco nos estudos a líder de uma das maiores empresas de tecnologia do mundo. Este é Steve Jobs (Ashton Kutcher), um sujeito de personalidade forte e dedicado, que não se incomoda de passar por cima dos outros para atingir suas metas, o que faz com que tenha dificuldades em manter relações amorosas e de amizade.");
        filme.setDataLancamento("06/09/2013");
        filme.setDuracao("2h 13m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/drama/jobs_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/jobs_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(48);
        filme.setNome("Marley & Eu");
        filme.setSinopse("John (Owen Wilson) e Jennifer Grogan (Jennifer Aniston) casaram-se recentemente e decidiram começar nova vida em West Palm Beach, na Flórida. Lá, eles trabalham em jornais concorrentes, compram um imóvel e enfrentam os desafios de uma vida de casal. Indeciso sobre sua capacidade em ser pai, John busca o conselho de seu colega Sebastian (Eric Dane), que sugere que compre um cachorro para a esposa. John aceita a sugestão e adota Marley, um labrador de 5 kg que logo se transforma em um grande cachorro de 45 kg, o que torna a casa deles um caos.");
        filme.setDataLancamento("25/12/2008");
        filme.setDuracao("1h 40m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/drama/marley_eu_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/marley_eu_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(49);
        filme.setNome("Quatro vidas de um cachorro");
        filme.setSinopse("Um cachorro morre e reencarna várias vezes na Terra. Embora encontre novas pessoas e viva muitas aventuras, ele mantém sempre o sonho de reencontrar o seu primeiro dono, Ethan, seu maior amigo e o grande amor de sua vida.");
        filme.setDataLancamento("26/01/2017");
        filme.setDuracao("1h 41m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/drama/quatro_vidas_cachorro_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/quatro_vidas_cachorro_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(50);
        filme.setNome("À procura da felicidade");
        filme.setSinopse("Chris Gardner enfrenta uma vida difícil. Despejado de seu apartamento, este pai solteiro e seu filho não têm onde morar. Chris consegue um estágio não remunerado em uma firma de prestígio. Sem dinheiro, os dois são obrigados a viver em abrigos, mas Chris está determinado a criar um vida melhor para ele e seu filho.");
        filme.setDataLancamento("02/02/2007");
        filme.setDuracao("1h 58m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/drama/procura_da_felicidade_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/drama/procura_da_felicidade_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES FICÇÃO //////

        filme = new Filme();
        filme.setFilmeId(51);
        filme.setNome("O Senhor dos Anéis - A sociedade do anel");
        filme.setSinopse("Numa terra fantástica e única, chamada Terra-Média, um hobbit (seres de estatura entre 80 cm e 1,20 m, com pés peludos e bochechas um pouco avermelhadas) recebe de presente de seu tio o Um Anel, um anel mágico e maligno que precisa ser destruído antes que caia nas mãos do mal. Para isso o hobbit Frodo (Elijah Woods) terá um caminho árduo pela frente, onde encontrará perigo, medo e personagens bizarros. Ao seu lado para o cumprimento desta jornada aos poucos ele poderá contar com outros hobbits, um elfo, um anão, dois humanos e um mago, totalizando 9 pessoas que formarão a Sociedade do Anel.");
        filme.setDataLancamento("01/01/2002");
        filme.setDuracao("2h 45m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/ficcao/senhor_dos_aneis_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/senhor_dos_aneis_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(52);
        filme.setNome("Lucy");
        filme.setSinopse("Quando a inocente jovem Lucy (Scarlett Johansson) aceita transportar drogas dentro do seu estômago, ela não conhece muito bem os riscos que corre. Por acaso, ela acaba absorvendo as drogas, e um efeito inesperado acontece: Lucy ganha poderes sobre-humanos, incluindo a telecinesia, a ausência de dor e a capacidade de adquirir conhecimento instantaneamente.");
        filme.setDataLancamento("28/08/2014");
        filme.setDuracao("1h 29m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/ficcao/lucy_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/lucy_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(53);
        filme.setNome("Matrix");
        filme.setSinopse("Um jovem programador é atormentado por estranhos pesadelos nos quais sempre está conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a levantar dúvidas sobre a realidade. E quando encontra os misteriosos Morpheus e Trinity, ele descobre que é vítima do Matrix, um sistema inteligente e artificial que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.");
        filme.setDataLancamento("21/05/1999");
        filme.setDuracao("2h 15m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/ficcao/matrix_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/matrix_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(54);
        filme.setNome("Sem Limites");
        filme.setSinopse("Encarando o desemprego e a rejeição de sua namorada, o escritor Eddie Morra tem certeza que não tem mais futuro. Mas tudo muda quando um velho amigo lhe dá uma droga que melhora as habilidades mentais. Viciado nesta química ainda não testada, Eddie chega ao topo do mundo financeiro e chama a atenção de um magnata que pretende usá-lo para fazer fortuna. Mas terríveis efeitos colaterais e a diminuição do estoque da droga ameaçam o colapso de Eddie.");
        filme.setDataLancamento("25/03/2011");
        filme.setDuracao("1h 45m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/ficcao/sem_limites_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/sem_limites_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(55);
        filme.setNome("Harry Potter e a Pedra Filosofal");
        filme.setSinopse("Adaptação da primeira obra popular de J.K. Rowling sobre Harry Potter, um menino que soube em seu aniversário de onze anos que é filho órfão de dois bruxos e possui poderes mágicos únicos. De filho indesejado, passa a ser um estudante de Hogwarts, uma escola inglesa para bruxos. Lá ele conhece vários amigos que o ajudam a descobrir a verdade sobre as mortes misteriosas de seus pais.");
        filme.setDataLancamento("23/11/2001");
        filme.setDuracao("2h 22m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/ficcao/harry_potter_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/harry_potter_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(56);
        filme.setNome("Star Trek: Sem Fronteiras");
        filme.setSinopse("Desta vez, Kirk (Chris Pine), Spock (Zachary Quinto) e a tripulação da Enterprise encontram-se no terceiro ano da missão de exploração do espaço prevista para durar cinco anos. Eles recebem um pedido de socorro que acaba os ligando ao maléfico vilão Krall (Idris Elba), um insurgente anti-Frota Estelar interessado em um objeto de posse do líder da nave. A Enterprise é atacada, e eles acabam em um planeta desconhecido, onde o grupo acaba sendo dividido em duplas.");
        filme.setDataLancamento("01/09/2016");
        filme.setDuracao("2h 03m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/ficcao/star_trek_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/star_trek_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(57);
        filme.setNome("Star Wars: O despertar da força");
        filme.setSinopse("A queda de Darth Vader e do Império levou ao surgimento de uma nova força sombria liderada por Kylo Ren, General Hux e Snoke: a Primeira Ordem. Eles procuram jedi Luke Skywalker, desaparecido há anos. Mas a Resistência, grupo liderado pela princesa Leia, precisa encontrá-lo antes.");
        filme.setDataLancamento("17/12/2015");
        filme.setDuracao("2h 15m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/ficcao/star_wars_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/star_wars_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(58);
        filme.setNome("Rogue One: Uma história Star Wars");
        filme.setSinopse("Ainda criança, Jyn Erso (Felicity Jones) foi afastada de seu pai, Galen (Mads Mikkelsen), devido à exigência do diretor Krennic (Ben Mendelsohn) que ele trabalhasse na construção da arma mais poderosa do Império, a Estrela da Morte. Criada por Saw Gerrera (Forest Whitaker), ela teve que aprender a sobreviver por conta própria ao completar 16 anos. Já adulta, Jyn é resgatada da prisão pela Aliança Rebelde, que deseja ter acesso a uma mensagem enviada por seu pai a Gerrera. Com a promessa de liberdade ao término da missão, ela aceita trabalhar ao lado do capitão Cassian Andor (Diego Luna) e do robô K-2SO.");
        filme.setDataLancamento("15/12/2016");
        filme.setDuracao("2h 14m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/ficcao/rogue_one_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/rogue_one_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(59);
        filme.setNome("Interestelar");
        filme.setSinopse("Após ver a Terra consumindo boa parte de suas reservas naturais, um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper (Matthew McConaughey) é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos. Ao lado de Brand (Anne Hathaway), Jenkins (Marlon Sanders) e Doyle (Wes Bentley), ele seguirá em busca de uma nova casa. Com o passar dos anos, sua filha Murph (Mackenzie Foy e Jessica Chastain) investirá numa própria jornada para também tentar salvar a população do planeta.");
        filme.setDataLancamento("06/11/2014");
        filme.setDuracao("2h 49m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/ficcao/interestelar_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/interestelar_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(60);
        filme.setNome("A Origem");
        filme.setSinopse("Don Cobb é um ladrão que invade os sonhos das pessoas e rouba segredos do subconsciente. As habilidades especiais de Cobb fazem com que ele seja procurado pelo mundo da espionagem empresarial, mas lhe custa tudo que ama. Cobb recebe uma missão impossível: plantar uma ideia na mente de uma pessoa. Se for bem-sucedido, será o crime perfeito, mas um amigo prevê todos os passos de Cobb.");
        filme.setDataLancamento("06/08/2010");
        filme.setDuracao("2h 28m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4.9"));
        filme.setCapaMenor(new Image("view/images/ficcao/a_origem_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/ficcao/a_origem_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES ROMANCE //////

        filme = new Filme();
        filme.setFilmeId(61);
        filme.setNome("Dirty Dancing - Ritmo quente");
        filme.setSinopse("No verão de 1963, a jovem Frances Houseman ou Baby (Jennifer Gray), passa as férias com os pais em um resort. Uma noite, ela segue até o alojamento dos funcionários do lugar, encantada pela música que vinha de lá. É onde encontra Johnny (Patrick Swayze), o instrutor de dança do hotel, um homem experiente e cheio de charme. Desse encontro, surge um inevitável romance entre os dois. Um romance que chega entre muitas aulas de dança e ensinamentos de amor.");
        filme.setDataLancamento("25/09/1987");
        filme.setDuracao("1h 40m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("2.5"));
        filme.setCapaMenor(new Image("view/images/romance/dirty_dance_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/dirty_dance_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(62);
        filme.setNome("Diário de uma paixão");
        filme.setSinopse("Na década de 40, na Carolina do Sul, o operário Noah Calhoun e a rica Allie estão desesperadamente apaixonados, mas os pais da jovem não aprovam o namoro. Quando Noah vai para a Segunda Guerra Mundial, parece ser o fim do romance. Enquanto isso, Allie se envolve com outro homem. Mas quando Noah retorna para a pequena cidade anos mais tarde, próximo ao casamento de Allie, logo se torna claro que a paixão ainda não acabou.");
        filme.setDataLancamento("13/08/2004");
        filme.setDuracao("2h 01m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/romance/diario_de_uma_paixao_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/diario_de_uma_paixao_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(63);
        filme.setNome("Cinquenta tons de cinza");
        filme.setSinopse("Anastasia Steele (Dakota Johnson) é uma estudante de literatura de 21 anos, recatada e virgem. Uma dia ela deve entrevistar para o jornal da faculdade o poderoso magnata Christian Grey (Jamie Dornan). Nasce uma complexa relação entre ambos: com a descoberta amorosa e sexual, Anastasia conhece os prazeres do sadomasoquismo, tornando-se o objeto de submissão do sádico Grey.");
        filme.setDataLancamento("12/02/2015");
        filme.setDuracao("2h 05m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/romance/cinquenta_tons_de_cinza_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/cinquenta_tons_de_cinza_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(64);
        filme.setNome("Sr. e Sra Smith");
        filme.setSinopse("John (Brad Pitt) e Jane Smith (Angelina Jolie) trabalham como assassinos de aluguel. Eles são também casados, mas um não sabe do trabalho do outro e vivem atualmente uma vida entediada. A situação entre eles muda de rumo quando cada um recebe um novo trabalho de sua respectiva agência, que faz com que eles se encontrem para realizar a mesma missão.");
        filme.setDataLancamento("10/06/2005");
        filme.setDuracao("2h 00m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/romance/sr_sra_smith_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/sr_sra_smith_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(65);
        filme.setNome("O curioso caso de Benjamin Button");
        filme.setSinopse("Nova Orleans, 1918. Benjamin Button (Brad Pitt) nasceu de forma incomum, com a aparência e doenças de uma pessoa em torno dos oitenta anos mesmo sendo um bebê. Ao invés de envelhecer com o passar do tempo, Button rejuvenesce. Quando ainda criança ele conhece Daisy (Cate Blanchett), da mesma idade que ele, por quem se apaixona. É preciso esperar que Daisy cresça, tornando-se uma mulher, e que Benjamin rejuvenesça para que, quando tiverem idades parecidas, possam enfim se envolver.");
        filme.setDataLancamento("16/01/2009");
        filme.setDuracao("2h 35m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/romance/benjamin_button_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/benjamin_button_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(66);
        filme.setNome("O amor é cego");
        filme.setSinopse("A história gira em torno de Hal, que aceitou o conselho de seu pai moribundo e namora apenas as formas da perfeição física feminina. Porém tudo muda após Hal ter um encontro inesperado com um guru, Tony Robbins. Intrigado pela superficialidade de Hal, Robbins o hipnotiza para que ele veja a beleza que existe mesmo em mulheres menos atraentes fisicamente.");
        filme.setDataLancamento("15/02/2002");
        filme.setDuracao("1h 54m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/romance/amor_e_cego_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/amor_e_cego_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(67);
        filme.setNome("Amor & Outras Drogas");
        filme.setSinopse("Maggie é uma mulher de espírito livre que não quer se amarrar a alguém de maneira alguma. Ela só não esperava conhecer Jamie, um charmoso vendedor de produtos farmacêuticos que tem todas as mulheres aos seus pés. Aos poucos, o relacionamento evoluiu e ambos descobrem que estão sob a influência da droga mais forte já inventada: o amor.");
        filme.setDataLancamento("28/01/2011");
        filme.setDuracao("1h 52m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("4.2"));
        filme.setCapaMenor(new Image("view/images/romance/amor_e_outras_drogas_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/amor_e_outras_drogas_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(68);
        filme.setNome("O lado bom da vida");
        filme.setSinopse("Depois de uma fase difícil de sua vida, Pat Solitano Jr. está disposto a seguir em frente e reconquistar sua ex-mulher. Através de amigos, ele conhece Tiffany, que lhe promete ajuda na tarefa da reconquista. Uma inesperada ligação começa a uni-los.");
        filme.setDataLancamento("01/02/2013");
        filme.setDuracao("2h 02m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("4"));
        filme.setCapaMenor(new Image("view/images/romance/lado_bom_da_vida_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/lado_bom_da_vida_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(69);
        filme.setNome("E se fosse verdade");
        filme.setSinopse("Ainda sofrendo com a morte da esposa, o arquiteto David Abbott se muda para um novo apartamento. Infelizmente, a inquilina anterior, uma médica workaholic que se chamava Elizabeth Masterson, depois de um turno de trabalho de 26 horas, se envolveu em um terrível acidente de carro e começa a assombrar seu antigo apartamento.");
        filme.setDataLancamento("23/12/2005");
        filme.setDuracao("1h 35m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/romance/e_se_fosse_verdade_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/e_se_fosse_verdade_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(70);
        filme.setNome("De repente é amor");
        filme.setSinopse("Quando Oliver e Emily se conhecem em um avião, eles sentem uma conexão instantânea, mas concordam que não foram feitos um para o outro. À medida que os anos passam e vivem suas vidas separadamente, o destino os reúne várias vezes e, com isso, eles se tornam bons amigos. Toda vez que um deles quer algo mais da relação, o outro parece satisfeito em ser apenas amigo.");
        filme.setDataLancamento("22/07/2005");
        filme.setDuracao("1h 47m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/romance/de_repente_e_amor_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/romance/de_repente_e_amor_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES TERROR //////

        filme = new Filme();
        filme.setFilmeId(71);
        filme.setNome("O chamado");
        filme.setSinopse("Rachel Keller (Naomi Watts) é uma jornalista que decide investigar a misteriosa morte de sua sobrinha. Ela percebe a relação da morte dela e de várias outras mortes com um estranho vídeo, que faz com que todas as pessoas que o assistam morram exatamente sete dias depois. Intrigada com a história, ela agora precisa descobrir um meio que impeça que a profecia se realize, já que ela e seu filho assistiram ao vídeo.");
        filme.setDataLancamento("31/01/2003");
        filme.setDuracao("1h 50m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/terror/o_chamado_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/o_chamado_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(72);
        filme.setNome("Drácula - A história nunca contada");
        filme.setSinopse("Os habitantes da Transilvânia sempre travaram batalhas épicas contra o Império Otomano até que foi feito um acordo no qual o rei local aceitou entregar centenas de crianças, dentre elas o filho de Vlad. Após dez anos, o rei turco exige mais crianças, só que, dessa vez, Vlad, agora nomeado príncipe, recusa-se a entregá-las, dando início a uma nova guerra. Mesmo sendo famoso por sua ferocidade nas batalhas, Vlad vai atrás de um ser das trevas para ganhar poderes sobre-humanos.");
        filme.setDataLancamento("23/10/2014");
        filme.setDuracao("1h 32m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/terror/dracula_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/dracula_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(73);
        filme.setNome("O massacre da serra elétrica - O início");
        filme.setSinopse("Thomas Lewitt (Andrew Bryniarski) nasceu em um parto complicado, no chão de um abatedouro no Texas. Ele é salvo por Luda Mae Hewitt (Marietta Marich) e passa a ser criado também pelo xerife Hoyt (R. Lee Ermey), Montgomery (Terrence Evans) e Henrietta. Thomas tem uma vida violenta, repleta de abusos físicos e emocionais, o que o faz se tornar o assassino Leatherface ao crescer. Quando dois jovens a passeio com suas namoradas se perdem, ele se tornam suas primeiras vítimas.");
        filme.setDataLancamento("12/10/2006");
        filme.setDuracao("1h 32m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3.9"));
        filme.setCapaMenor(new Image("view/images/terror/massacre_serra_eletrica_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/massacre_serra_eletrica_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(74);
        filme.setNome("Sexta-feira 13");
        filme.setSinopse("Clay (Jared Padalecki) vai à misteriosa floresta de Crystal Lake, em busca de sua irmã desaparecida. Lá ele encontra restos de velhas cabanas, aparentemente abandonadas. Apesar de ser avisado pelos oficiais e habitantes locais, ele resolve explorar o local juntamente com uma jovem, que está em um grupo que se formou para passar um final de semana de aventuras. O que eles não esperavam era encontrar Jason Voorhess (Derek Mears), o assassino da máscara de hóquei.");
        filme.setDataLancamento("13/02/2009");
        filme.setDuracao("1h 37m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_18.png"));
        filme.setValorAluguel(new BigDecimal("3.9"));
        filme.setCapaMenor(new Image("view/images/terror/sexta_feira_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/sexta_feira_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(75);
        filme.setNome("Doce Vingança");
        filme.setSinopse("Jennifer Hills (Sarah Butler) é uma jovem escritora, que resolveu ir para uma sossegada cabana na mata com o objetivo de escrever seu novo livro. Sua presença logo é notada em um pequeno vilarejo próximo, o que faz com que alguns moradoras resolvam lhe pregar um susto. A brincadeira vai mais longe do que deveria e faz com que Jennifer passe por atos de humilhação, incluindo tortura física e psicológica. Ela consegue escapar e, a partir de então, concentra todo seu tempo e forças para planejar sua vingança.");
        filme.setDataLancamento("11/03/2011");
        filme.setDuracao("1h 47m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/terror/doce_vinganca_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/doce_vinganca_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(76);
        filme.setNome("Nunca diga seu nome");
        filme.setSinopse("Três estudantes universitários decidem sair para acampar no tranquilo estado do Wisconsin, nos Estados Unidos. Mas os planos de terem alguns dias e diversão e descanso são interrompidos quando suas vidas se cruzam com o temido \"The Bye Bye Man\", uma criatura mística e sobrenatural que acaba perseguindo-os. Agora eles vão ter que lutar para sobreviver, contra este que é a raiz de todos os atos maus do homem.");
        filme.setDataLancamento("01/08/2017");
        filme.setDuracao("1h 37m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("6.5"));
        filme.setCapaMenor(new Image("view/images/terror/nunca_diga_seu_nome_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/nunca_diga_seu_nome_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(77);
        filme.setNome("Atividade paranormal: Dimensão fantasma");
        filme.setSinopse("Quando se muda para uma nova casa com a família, Ryan Fleege (Chris J. Murray) descobre uma caixa com dezenas de fitas cassetes de décadas atrás. Estranhamente, as imagens parecem se comunicar com os vivos. Procurando mais, Ryan encontra uma câmera diferente, capaz de registrar atividades paranormais. Com a ajuda da esposa, do irmão e da filha, ele passa a gravar fenômenos malignos que ameaçam seus entes queridos.");
        filme.setDataLancamento("22/10/2015");
        filme.setDuracao("1h 28m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3.5"));
        filme.setCapaMenor(new Image("view/images/terror/atividade_paranormal_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/atividade_paranormal_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(78);
        filme.setNome("O ritual");
        filme.setSinopse("Michael Kovak (Colin O’Donoghue) é um seminarista cético e decidido a abandonar seu caminho na igreja, mas seu superior o orienta a passar um período no Vaticano para estudar rituais de exorcismo. Uma vez lá, suas dúvidas e questionamentos só aumentam na medida em que seu contato com o padre Lucas (Anthony Hopkins), um famoso jesuíta exorcista, o apresenta ao lado mais obscuro da igreja. Ao conhecer a jornalista Angeline (Alice Braga), que investiga as atividades do religioso, suas reflexões sobre a crença no diabo e em Deus não param de crescer.");
        filme.setDataLancamento("11/02/2011");
        filme.setDuracao("1h 52m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3.9"));
        filme.setCapaMenor(new Image("view/images/terror/ritual_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/ritual_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(79);
        filme.setNome("Todo mundo em pânico 4");
        filme.setSinopse("Cindy Campbell (Anna Faris) agora trabalha como enfermeira, precisando cuidar de uma senhora que mora em uma casa onde fatos estranhos acontecem. Ela é vizinha de Tom Ryan (Craig Bierko), um homem divorciado que está cuidando de seus dois filhos. Quando uma invasão alienígena tem início eles precisam fugir, em busca de salvação. No caminho Cindy ainda reencontra Brenda (Regina Hall), sua amiga interesseira e ninfomaníaca, que agora trabalha como repórter.");
        filme.setDataLancamento("02/06/2006");
        filme.setDuracao("1h 23m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("3"));
        filme.setCapaMenor(new Image("view/images/terror/todo_mundo_em_panico_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/todo_mundo_em_panico_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(80);
        filme.setNome("Annabelle");
        filme.setSinopse("Um casal se prepara para a chegada de sua primeira filha e compra para ela uma boneca. Quando sua casa é invadida por membros de uma seita, o casal é violentamente atacado e a boneca, Annabelle, se torna recipiente de uma entidade do mal.");
        filme.setDataLancamento("09/10/2014");
        filme.setDuracao("1h 38m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("4.9"));
        filme.setCapaMenor(new Image("view/images/terror/annabelle_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/terror/annabelle_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);


        ////// FILMES MAIS ALUGADOS //////

        filme = new Filme();
        filme.setFilmeId(81);
        filme.setNome("Planeta dos macacos - A Guerra");
        filme.setSinopse("Humanos e macacos cruzam os caminhos novamente. César (Andy Serkis) e seu grupo são forçados a entrar em uma guerra contra um exército de soldados liderados por um impiedoso coronel (Woody Harrelson). Depois que vários macacos perdem suas vidas no conflito e outros são capturados, César luta contra seus instintos e parte em busca de vingança. Dessa jornada, o futuro do planeta poderá estar em jogo.");
        filme.setDataLancamento("03/08/2017");
        filme.setDuracao("2h 20m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/planeta_dos_macacos_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/planeta_dos_macacos_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(82);
        filme.setNome("O Acampamento");
        filme.setSinopse("Ian (Ian Meadows) e Samantha (Harriet Dyer) chegam a um acampamento isolado para encontrar um SUV e uma tenda - sem nenhum sinal dos ocupantes. A descoberta de uma criança angustiada vagando na floresta desencadeia terríveis eventos que irão testar o ponto de ruptura do jovem casal.");
        filme.setDataLancamento("31/08/2017");
        filme.setDuracao("1h 28m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/acampamento_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/acampamento_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(83);
        filme.setNome("Velozes e furiosos 8");
        filme.setSinopse("Dom (Vin Diesel) e Letty (Michelle Rodriguez) estão curtindo a lua de mel em Havana, mas a súbita aparição de Cipher (Charlize Theron) atrapalha os planos do casal. Ela logo arma um plano para chantagear Dom, de forma que ele traia seus amigos e passe a ajudá-la a obter ogivas nucleares. Tal situação faz com Letty reúna os velhos amigos, que agora precisam enfrentar Cipher e, consequentemente, Dom.");
        filme.setDataLancamento("13/04/2017");
        filme.setDuracao("2h 16m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_14.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/velozes_furiosos8_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/velozes_furiosos8_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(84);
        filme.setNome("O poderoso chefinho");
        filme.setSinopse("Um bebê falante que usa terno e carrega uma maleta misteriosa une forças com seu irmão mais velho invejoso para impedir que um inescrupuloso CEO acabe com o amor no mundo. A missão é salvar os pais, impedir a catástrofe e provar que o mais intenso dos sentimentos é uma poderosa força.");
        filme.setDataLancamento("30/03/2017");
        filme.setDuracao("1h 38m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_10.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/poderoso_chefinho_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/poderoso_chefinho_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(85);
        filme.setNome("Meu malvado favorito 3");
        filme.setSinopse("Nos anos 1980, Balthazar Bratt fazia muito sucesso através de sua série de TV, onde interpretava um vilão chamado EvilBratt. Entretanto, o tempo passou, ele cresceu, a voz mudou e a fama se foi. Com a série cancelada, Balthazar tornou-se uma pessoa vingativa que, nas décadas seguintes, planejou seu retorno triunfal como vingança. Gru e Lucy são chamados para enfrentá-lo logo em sua reaparição, mas acabam sendo demitidos por não terem conseguido capturá-lo. Gru então descobre que possui um irmão gêmeo, Dru, e parte com a família para encontrá-lo no país em que vive.");
        filme.setDataLancamento("29/06/2017");
        filme.setDuracao("1h 30m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_l.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/meu_malvado_favorito3_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/meu_malvado_favorito3_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(86);
        filme.setNome("Bingo - O rei das manhãs");
        filme.setSinopse("Cinebiografia de Arlindo Barreto, um dos intérpretes do palhaço Bozo no programa matinal homônimo exibido pelo SBT durante a década de 1980. Barreto alcançou a fama graças ao personagem, apesar de jamais ser reconhecido pelas pessoas por sempre estar fantasiado. Esta frustração o levou a se envolver com drogas, chegando a utilizar cocaína e crack nos bastidores do programa.");
        filme.setDataLancamento("24/08/2017");
        filme.setDuracao("1h 53m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/bingo_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/bingo_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(87);
        filme.setNome("Guardiões da Galáxia vol.2");
        filme.setSinopse("Agora já conhecidos como os Guardiões da Galáxia, os guerreiros viajam ao longo do cosmos e lutam para manter sua nova família unida. Enquanto isso tentam desvendar os mistérios da verdadeira paternidade de Peter Quill (Chris Pratt).");
        filme.setDataLancamento("27/04/2017");
        filme.setDuracao("2h 16m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/guardioes_galaxia2_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/guardioes_galaxia2_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(88);
        filme.setNome("Logan");
        filme.setSinopse("Em 2029, Logan (Hugh Jackman) ganha a vida como chofer de limousine para cuidar do nonagenário Charles Xavier (Patrick Stewart). Debilitado fisicamente e esgotado emocionalmente, ele é procurado por Gabriela (Elizabeth Rodriguez), uma mexicana que precisa da ajuda do ex-X-Men para defender a pequena Laura Kinney / X-23 (Dafne Keen). Ao mesmo tempo em que se recusa a voltar à ativa, Logan é perseguido pelo mercenário Donald Pierce (Boyd Holbrook), interessado na menina.");
        filme.setDataLancamento("02/03/2017");
        filme.setDuracao("2h 17m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("6.9"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/logan_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/logan_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(89);
        filme.setNome("Mulher Maravilha");
        filme.setSinopse("Treinada desde cedo para ser uma guerreira imbatível, Diana Prince (Gal Gadot) nunca saiu da paradisíaca ilha em que é reconhecida como princesa das Amazonas. Quando o piloto Steve Trevor (Chris Pine) se acidenta e cai numa praia do local, ela descobre que uma guerra sem precedentes está se espalhando pelo mundo e decide deixar seu lar certa de que pode parar o conflito. Lutando para acabar com todas as lutas, Diana percebe o alcance de seus poderes e sua verdadeira missão na Terra.");
        filme.setDataLancamento("01/06/2017");
        filme.setDuracao("2h 21m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_12.png"));
        filme.setValorAluguel(new BigDecimal("6"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/mulher_maravilha_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/mulher_maravilha_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

        filme = new Filme();
        filme.setFilmeId(90);
        filme.setNome("Cinquenta tons mais escuros");
        filme.setSinopse("Incomodada com os hábitos e atitudes de Christian Grey (Jamie Dornan), Anastasia (Dakota Johnson) decide terminar o relacionamento e focar no desenvolvimento de sua carreira. Ele, no entanto, não desiste tão fácil e fica sempre ao seu encalço, insistindo que aceita as regras dela. Tal cortejo acaba funcionando e ela reinicia o relacionamento com o jovem milionário, sendo que, aos poucos, passa a compreender melhor os jogos sexuais que ele tanto aprecia.");
        filme.setDataLancamento("09/02/2017");
        filme.setDuracao("1h 58m");
        filme.setClassificacao(new Image("view/images/classificacao/classificacao_16.png"));
        filme.setValorAluguel(new BigDecimal("5.5"));
        filme.setCapaMenor(new Image("view/images/mais_alugados/cinquenta_tons_mais_escuros_pequeno.png"));
        filme.setCapaOriginal(new Image("view/images/mais_alugados/cinquenta_tons_mais_escuros_capa.png"));
        filmeCTR = new FilmeCTR(filme, btnLista_filmes);
        Locflix.todosFilmes.add(filmeCTR);

    }
}
