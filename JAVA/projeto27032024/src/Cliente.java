public class Cliente {

    String nome ="";
    String cpf ="";
    String rg="";
    String email="";
    String telefone="";
   
    public void cadastrar(){

    }
    
        public String mostrar(){
            return "\n Nome: " + nome + 
            "\n CPF: " + cpf + 
            "\n RG: " + rg + 
            "\n E-mail: " + email + 
            "\n Telefone: " + telefone;
            
        }
}

