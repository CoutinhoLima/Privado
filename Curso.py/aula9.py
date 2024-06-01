while True:
    
    numero1 = input('Digite o primeiro numero: ')
    operador = input('Digite o simbolo da operação que deseja: ')
    numero2= input('Digite o segundo numero: ')
    f_numero1 = float(numero1)
    f_numero2 = float(numero2)
    
    if operador == '+':
        soma = f_numero1 + f_numero2
        print(f'A soma de {numero1} + {numero2} é {soma}')
    elif operador == "x":
        multiplicação = f_numero1 * f_numero2
        print(f'A multiplicação de {numero1} x {numero2} é {multiplicação}')
    elif operador == "/":
        divisao = f_numero1 / f_numero2
        print(f'A divisão de {numero1} dividido por {numero2} é {divisao}')
    elif operador == "-":
        subtraçao = f_numero1 - f_numero2
    if len(operador) > 1:
        print('Digite apenas um operador')
        continue
    
    encerrar = input('Deseja encerrar o programa? ').lower().startswith('s')
    
    if encerrar is True:
        break