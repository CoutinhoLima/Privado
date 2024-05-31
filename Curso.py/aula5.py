"""
Faça um programa que peça ao usuário para digitar um número inteiro,
informe se este número é par ou ímpar. Caso o usuário não digite um número
inteiro, informe que não é um número inteiro.
"""
numero_inteiro= input('Digite um numero inteiro: ')

if numero_inteiro.isdigit():
    inteiro = int((numero_inteiro))
    if inteiro % 2 == 0:
        print(f'{inteiro} é par')
    else:print(f'{inteiro} é impar')
else:print('Digite um numero inteiro seu animal')