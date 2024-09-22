import matplotlib.pyplot as plt

class Livro:
    def __init__(self, titulo, autor, genero, quantidade):
        self.titulo = titulo
        self.autor = autor
        self.genero = genero
        self.quantidade = quantidade

livros = []

def cadastrar_livro():
    titulo = input("Digite o título do livro: ")
    autor = input("Digite o autor do livro: ")
    genero = input("Digite o gênero do livro: ")
    quantidade = int(input("Digite a quantidade disponível: "))
    livro = Livro(titulo, autor, genero, quantidade)
    livros.append(livro)
    print("Livro cadastrado com sucesso!")

def listar_livros():
    print("\nLista de Livros:")
    for livro in livros:
        print(f"Título: {livro.titulo} | Autor: {livro.autor} | Gênero: {livro.genero} | Quantidade: {livro.quantidade}")

def buscar_livro_por_titulo(titulo):
    for livro in livros:
        if livro.titulo.lower() == titulo.lower():
            print(f"Encontrado: {livro.titulo} | Autor: {livro.autor} | Gênero: {livro.genero} | Quantidade: {livro.quantidade}")
            return
    print("Livro não encontrado.")

def gerar_grafico_por_genero():
    generos = [livro.genero for livro in livros]
    contagem_generos = {genero: generos.count(genero) for genero in set(generos)}

    plt.bar(contagem_generos.keys(), contagem_generos.values())
    plt.xlabel("Gênero")
    plt.ylabel("Quantidade de Livros")
    plt.title("Quantidade de Livros por Gênero")
    plt.show()


print("Sistema de Gerenciamento de Livros")
while True:
    print("\nOpções:")
    print("1. Cadastrar Livro")
    print("2. Listar Livros")
    print("3. Buscar Livro por Título")
    print("4. Gerar Gráfico por Gênero")
    print("5. Sair")
    opcao = input("Escolha uma opção: ")

    if opcao == '1':
            cadastrar_livro()
    elif opcao == '2':
            listar_livros()
    elif opcao == '3':
            titulo_busca = input("Digite o título do livro a ser buscado: ")
            buscar_livro_por_titulo(titulo_busca)
    elif opcao == '4':
            gerar_grafico_por_genero()
    elif opcao == '5':
        print("Encerrando o sistema. Até mais!")
        break
    else:
        print("Opção inválida. Escolha novamente.")

