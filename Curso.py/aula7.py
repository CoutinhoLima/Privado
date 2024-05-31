nome = input('Digite seu nome: ')
quantidade = len(nome)

if quantidade >1:
    if quantidade >=1 and quantidade <= 4:
        print('Seu nome é curto')
    elif quantidade >=5 and quantidade <=6:
        print('Seu nome é normal')
    elif quantidade >6:
        print('Seu nome é grande')
else:
    print('Digite um nome com mais de uma letra')
