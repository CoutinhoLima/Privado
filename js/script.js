let botao1 = document.querySelector("#botao1")
 
function mensagem(texto) {
    alert(texto)
}
 
 
let botao2 = document.querySelector("#botao2")
botao2.addEventListener('click', function() {
    mensagem("Minha mensagem");
})
 
 
let btEnviar = document.querySelector("#btEnviar")
btEnviar.addEventListener('click', function(event) {
    event.preventDefault()
    
    let erro = document.querySelector('#erro');
    erro.innerHTML = ""
 
    let nome = document.querySelector('#nome');
    let email = document.querySelector('#email');
    let senha = document.querySelector('#senha');
    let confirmar = document.querySelector('#confirmar');
 
    if (nome.value == '') {
        erro.innerHTML = "O campo nome está vazio"
        return false
    }
 
    if (email.value == '') {
        erro.innerHTML = "O campo email está vazio"
        return false
    }
 
    if (senha.value == '') {
        erro.innerHTML = "O campo senha está vazia"
        return false
    }
 
    if (confirmar.value == '') {
        erro.innerHTML = "O campo confirmar senha está vazio"
        return false
    }
 
    if (senha.value != confirmar.value) {
        erro.innerHTML = "O campo senha é diferente do confirmar senha"
        return false
    }
 
    alert("Formulário enviado!")
 
})