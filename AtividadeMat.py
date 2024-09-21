def resolver_problemas():
    # Problema 01
    J1 = 140 / 7
    P1 = 2 * J1
    F1 = 4 * J1

    # Problema 02
    M2 = 1100 / 5.5
    G2 = 4 * M2
    T2 = M2 / 2

    # Problema 03
    A3 = 1400 / 3.5
    F3 = 2 * A3
    J3 = A3 / 2

    # Problema 04
    J4 = 90 / 9
    A4 = 3 * J4
    B4 = 5 * J4

    # Problema 05
    J5 = 84 / 4.2  
    T5 = 3 * J5
    A5 = J5 / 5

    # Problema 06
    R6 = 120 / 8  
    J6 = 3 * R6
    M6 = 4 * R6

    # Problema 07
    R7 = 126 / 7  
    J7 = 2 * R7
    M7 = 4 * R7

    # Problema 08
    R8 = 68 / 4.25  
    M8 = 3 * R8
    C8 = R8 / 4

    return {
        "Problema 01": {"Jorge": J1, "Paulo": P1, "Felipe": F1},
        "Problema 02": {"Geraldo": G2, "Marcos": M2, "Taís": T2},
        "Problema 03": {"José": J3, "Augusto": A3, "Fábio": F3},
        "Problema 04": {"Júlio": J4, "Abreu": A4, "Bruno": B4},
        "Problema 05": {"Tiago": T5, "Jô": J5, "Alfeu": A5},
        "Problema 06": {"Juca": J6, "Rita": R6, "Márcia": M6},
        "Problema 07": {"João": J7, "Ricardo": R7, "Mateus": M7},
        "Problema 08": {"Maria": M8, "Roger": R8, "Caio": C8},
    }

# Executando a função e imprimindo os resultados
resultados = resolver_problemas()
for problema, valores in resultados.items():
    print(f"{problema}:")
    for pessoa, quantidade in valores.items():
        print(f"  {pessoa}: {quantidade}")