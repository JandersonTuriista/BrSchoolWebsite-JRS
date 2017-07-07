package controler;

import DAO.DAOProfessor;
import model.Professor;

//Salva os Dados
public class CtrlProfessor {
    public int salvarCtrl(Professor pProfessor){
        return new DAOProfessor().salvarDAO(pProfessor);
    }
//Mostra os Dados    
    public Professor getCtrl(String pPnome){
        return new DAOProfessor().getProfessorDAO(pPnome);
    }
//Exclui os Dados    
    public boolean excluirCtrl(String pNomeProfessor){
        return new DAOProfessor().excluirDAO(pNomeProfessor);
    }
//Atualiza os Dados    
    public boolean updateCtrl(Professor pProfessor){
        return new DAOProfessor().updateDAO(pProfessor);
    }
}