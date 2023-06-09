package DAOclass;

import java.util.List;

import DAOinterface.TaskDAO;
import Model.Client;
import Model.User;
import Model.Visitor;

public class taskDAOimpl implements TaskDAO {
    protected int taskid, taskqty;

    @Override
    public void addtask(Client c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addtask'");
    }

    @Override
    public void updatetask(Client c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatetask'");
    }

    @Override
    public void deletetask(Client c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
    }

    @Override
    public void searchtask(Client c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
    }

    @Override
    public void assigntask(Client c, Visitor v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assigntask'");
    }

    @Override
    public void displaytaskVisitor(Visitor c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displaytaskVisitor'");
    }

}
