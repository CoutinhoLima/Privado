import sqlite3
import matplotlib as plt
import pandas as pd

# Passo 1.1: Conectar ao banco de dados (ou criar, se não existir)
conexao = sqlite3.connect('dados_vendas.db')
# Passo 1.2: Criar um cursor
3
cursor = conexao.cursor()
# Passo 1.3: Criar uma tabela (se não existir)
cursor.execute('''
CREATE TABLE vendas1 (
id_venda INTEGER PRIMARY KEY AUTOINCREMENT,
data_venda DATE,
produto TEXT,
categoria TEXT,
valor_venda REAL
)
''')
# Passo 1.4: Inserir alguns dados
cursor.execute('''
INSERT INTO vendas1 (data_venda, produto, categoria, valor_venda) VALUES
('2023-01-01', 'Produto A', 'Eletrônicos', 1500.00),
('2023-01-05', 'Produto B', 'Roupas', 350.00),
('2023-02-10', 'Produto C', 'Eletrônicos', 1200.00),
('2023-03-15', 'Produto D', 'Livros', 200.00),
('2023-03-20', 'Produto E', 'Eletrônicos', 800.00),
('2023-04-02', 'Produto F', 'Roupas', 400.00),
('2023-05-05', 'Produto G', 'Livros', 150.00),
('2023-06-10', 'Produto H', 'Eletrônicos', 1000.00),
('2023-07-20', 'Produto I', 'Roupas', 600.00),
('2023-08-25', 'Produto J', 'Eletrônicos', 700.00),
('2023-09-30', 'Produto K', 'Livros', 300.00),
('2023-10-05', 'Produto L', 'Roupas', 450.00),
('2023-11-15', 'Produto M', 'Eletrônicos', 900.00),
('2023-12-20', 'Produto N', 'Livros', 250.00);
''')
# Passo 1.5: Confirmar as mudanças
conexao.commit()
# Conectar ao banco de dados
conexao = sqlite3.connect('dados_vendas.db')

# Carregar os dados em um DataFrame
query = "SELECT * FROM vendas1"
df_vendas = pd.read_sql_query(query, conexao)

# Verificar as primeiras linhas do DataFrame
print(df_vendas.head())

# Total de vendas
total_vendas = df_vendas.shape[0]
print(f"Total de vendas registradas: {total_vendas}")

# Média de valor de venda
media_valor_venda = df_vendas['valor_venda'].mean()
print(f"Média de valor de venda: R${media_valor_venda:.2f}")

# Vendas por categoria
vendas_por_categoria = df_vendas.groupby('categoria')['id_venda'].count()
print("\nVendas por categoria:")
print(vendas_por_categoria)

plt.figure(figsize=(8, 6))
plt.bar(vendas_por_categoria.index, vendas_por_categoria.values)
plt.xlabel('Categoria')
plt.ylabel('Total de Vendas')
plt.title('Vendas por Categoria')
plt.show()