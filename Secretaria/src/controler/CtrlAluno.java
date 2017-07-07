package controler;

import DAO.DAOAluno;
import model.Aluno;

public class CtrlAluno {
    
    public int salvarCtrl(Aluno pAluno){
        return new DAOAluno().salvarDAO(pAluno);
    }
    
    public Aluno getCtrl(int pPmatricula){
        return new DAOAluno().getAlunoDAO(pPmatricula);
    }
    
    public boolean excluirCtrl(int pMatriculaAluno){
        return new DAOAluno().excluirDAO(pMatriculaAluno);
    }
    
    public boolean updateCtrl(Aluno pAluno){
        return new DAOAluno().updateDAO(pAluno);
    }
    
}