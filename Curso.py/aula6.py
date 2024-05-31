hora = input('Que horas são? ')
try:
    if hora.isdecimal and hora <24:
        inteiro_hora= float((hora))
    if inteiro_hora >= 0 and inteiro_hora <=11:
        print('Bom dia, caro usuário')
    elif inteiro_hora >= 12 and inteiro_hora <= 17:
        print('Boa tarde, caro usuário')
    elif inteiro_hora >= 18 and inteiro_hora <= 23:
        print('Boa noite,caro usuário')
except:
    print('Digite uma hora valida')