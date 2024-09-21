""" Aqui a logica foi de criar uma lista e um sistema de repetição para permitir o usuario escrever quantas notas
ele(a) quiser antes de calcular a média usando a função."""
notas = []
while True:
    nota_str = input("Digite a nota do aluno ou digite 'fim' para calcular a media das notas inseridas: ")
    if nota_str.lower() == "fim":
        break
    try:
        nota = float(nota_str)
        notas.append(nota)
    except ValueError:
        print("Valor inválido. Digite um número válido ou 'fim' para encerrar.")

"""Aqui é a função para calcular a média e logo abaixo está os prints e as condicionais."""
def calcular_media(notas):
    total_notas = len(notas)
    if total_notas == 0:
        return 0
    soma = sum(notas)
    media = soma / total_notas
    return media

media = calcular_media(notas)
if media >= 7:
    print (f"A media do aluno foi de {media} logo o aluno está aprovado ")
else:
    print (f"A media do aluno foi {media} logo o aluno não foi aprovado ")