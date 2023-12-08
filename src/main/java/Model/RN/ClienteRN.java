package Model.RN;

import Model.DAO.ClienteDAO;
import Model.DAO.ClienteDAOImpl;
import Model.VO.Cliente;
import util.VerificadorCPF;

public class ClienteRN {

    private final ClienteDAO clienteDAO;

    public ClienteRN(){
        clienteDAO = new ClienteDAOImpl();
    }

    public static boolean clienteVerificacao(Cliente cli){
        String cpf;
        try{
            cpf = cli.getClienteCPF();
            if(cpf.length() <= 5){
                return false;
            }
            else return true;
            
            //VerificadorCPF veriCPF = new VerificadorCPF();
            //veriCPF.isCPF(cli.getClienteCPF());

        }catch(UnknownError e){
            System.out.println("Erro: " + e);
            return false;
        }
    }
}
