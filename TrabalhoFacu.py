import datetime

class Produto:
    def __init__(self, nome, categoria, quantidade, preco, localizacao):
        """
        Inicializa um novo produto.

        Args:
            nome (str): Nome do produto.
            categoria (str): Categoria do produto.
            quantidade (int): Quantidade do produto no estoque.
            preco (float): Preço do produto.
            localizacao (str): Localização do produto no depósito.
        """
        self.nome = nome
        self.categoria = categoria
        self.quantidade = quantidade
        self.preco = preco
        self.localizacao = localizacao

class Movimentacao:
    def __init__(self, produto, quantidade, tipo):
        """
        Registra uma movimentação de estoque (entrada ou saída).

        Args:
            produto (Produto): O produto movimentado.
            quantidade (int): Quantidade movimentada.
            tipo (str): Tipo de movimentação ('entrada' ou 'saida').
        """
        self.produto = produto
        self.quantidade = quantidade
        self.tipo = tipo
        self.data = datetime.datetime.now()

estoque = []  # Lista para armazenar os produtos
movimentacoes = []  # Lista para armazenar as movimentações

def cadastrar_produto(nome, categoria, quantidade, preco, localizacao):
    """
    Cadastra um novo produto no estoque.

    Args:
        nome (str): Nome do produto.
        categoria (str): Categoria do produto.
        quantidade (int): Quantidade inicial do produto.
        preco (float): Preço do produto.
        localizacao (str): Localização do produto no depósito.
    """
    novo_produto = Produto(nome, categoria, quantidade, preco, localizacao)
    estoque.append(novo_produto)
    print(f"Produto '{nome}' cadastrado com sucesso!")

def atualizar_estoque(nome_produto, quantidade, tipo):
    """
    Atualiza o estoque de um produto, registrando uma movimentação de entrada ou saída.

    Args:
        nome_produto (str): Nome do produto a ser atualizado.
        quantidade (int): Quantidade a ser adicionada ou removida do estoque.
        tipo (str): Tipo de movimentação ('entrada' ou 'saida').
    """
    if tipo not in ['entrada', 'saida']:
        print("Tipo inválido! Use 'entrada' ou 'saida'.")
        return

    for produto in estoque:
        if produto.nome == nome_produto:
            if tipo == 'entrada':
                produto.quantidade += quantidade
            elif tipo == 'saida':
                if produto.quantidade >= quantidade:
                    produto.quantidade -= quantidade
                else:
                    print("Estoque insuficiente")
                    return
            movimentacao = Movimentacao(produto, quantidade, tipo)
            movimentacoes.append(movimentacao)
            print(f"Estoque de '{nome_produto}' atualizado com sucesso!")
            return

    print(f"Produto '{nome_produto}' não encontrado!")

def rastrear_localizacao(nome_produto):
    """
    Rastreia a localização de um produto no estoque.

    Args:
        nome_produto (str): Nome do produto para rastrear a localização.

    Returns:
        str: Localização do produto ou mensagem de erro.
    """
    for produto in estoque:
        if produto.nome == nome_produto:
            return produto.localizacao
    return "Produto não encontrado"

def gerar_relatorio_estoque():
    """
    Gera um relatório com todos os produtos no estoque.

    Returns:
        list: Lista de strings representando os produtos no estoque ou mensagem caso esteja vazio.
    """
    if not estoque:
        return ["Não há produtos no estoque."]
    
    relatorio = []
    for produto in estoque:
        relatorio.append(f"Produto: {produto.nome}, Categoria: {produto.categoria}, Quantidade: {produto.quantidade}, Preço: {produto.preco}, Localização: {produto.localizacao}") 
    return relatorio

def gerar_relatorio_movimentacoes():
    """
    Gera um relatório de todas as movimentações realizadas no estoque.

    Returns:
        list: Lista de strings representando as movimentações ou mensagem caso esteja vazio.
    """
    if not movimentacoes:
        return ["Não há movimentações registradas."]
    
    relatorio = []
    for mov in movimentacoes:
        relatorio.append(f"Produto: {mov.produto.nome}, Quantidade: {mov.quantidade}, Tipo: {mov.tipo}, Data: {mov.data}") 
    return relatorio

def produtos_com_estoque_baixo(limite=5):
    """
    Retorna uma lista de produtos com estoque abaixo do limite especificado.

    Args:
        limite (int): Limite mínimo de estoque para ser considerado baixo.

    Returns:
        list: Lista de produtos com estoque baixo ou mensagem caso não haja.
    """
    produtos_baixo_estoque = [produto for produto in estoque if produto.quantidade <= limite]
    return produtos_baixo_estoque if produtos_baixo_estoque else ["Nenhum produto com estoque baixo."]

def produtos_com_excesso_estoque(limite=100):
    """
    Retorna uma lista de produtos com estoque acima do limite especificado.

    Args:
        limite (int): Limite máximo de estoque para ser considerado excessivo.

    Returns:
        list: Lista de produtos com excesso de estoque ou mensagem caso não haja.
    """
    produtos_excesso_estoque = [produto for produto in estoque if produto.quantidade >= limite]
    return produtos_excesso_estoque if produtos_excesso_estoque else ["Nenhum produto com excesso de estoque."]

def menu():
    """
    Exibe o menu principal do sistema de gerenciamento de estoque e interage com o usuário.
    """
    while True:
        print("\nSistema de Gerenciamento de Estoque")
        print("1. Cadastrar Produto")
        print("2. Atualizar Estoque")
        print("3. Rastrear Localização")
        print("4. Gerar Relatório de Estoque")
        print("5. Gerar Relatório de Movimentações")
        print("6. Produtos com Estoque Baixo")
        print("7. Produtos com Excesso de Estoque")
        print("8. Sair")
        escolha = input("Escolha uma opção: ")
        
        if escolha == '1':
            nome = input("Nome do produto: ")
            categoria = input("Categoria: ")
            quantidade = int(input("Quantidade: "))
            preco = float(input("Preço: "))
            localizacao = input("Localização no depósito: ")
            cadastrar_produto(nome, categoria, quantidade, preco, localizacao)
        elif escolha == '2':
            nome_produto = input('Nome do produto: ')
            quantidade = int(input('Quantidade: '))
            tipo = input('Tipo (Entrada ou Saida): ').lower()
            atualizar_estoque(nome_produto, quantidade, tipo)
        elif escolha == '3':
            nome_produto = input('Digite o nome do produto: ')
            localizacao_produto = rastrear_localizacao(nome_produto)
            print(f"Localização de '{nome_produto}': {localizacao_produto}")
        elif escolha == '4':
            relatorio = gerar_relatorio_estoque()
            for linha in relatorio:
                print(linha)
        elif escolha == '5':
            relatorio = gerar_relatorio_movimentacoes()
            for linha in relatorio:
                print(linha)
        elif escolha == '6':
            produtos_baixo_estoque = produtos_com_estoque_baixo()
            print("Produtos com estoque baixo:")
            for produto in produtos_baixo_estoque:
                print(produto.nome)
        elif escolha == '7':
            produtos_excesso_estoque = produtos_com_excesso_estoque()
            print("Produtos com excesso de estoque:")
            for produto in produtos_excesso_estoque:
                print(produto.nome)
        elif escolha == '8':
            print("Saindo do sistema...")
            break
        else:
            print('Opção inválida, tente novamente.')

if __name__ == '__main__':
    menu()