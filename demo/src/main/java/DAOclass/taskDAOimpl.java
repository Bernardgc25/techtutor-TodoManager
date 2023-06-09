package DAOclass;

import java.util.List;

import DAOinterface.TaskDAO;

import Model.User;
import Model.Vistor;

public class taskDAOimpl implements TaskDAO {
    protected int taskid, taskqty;

    @Override
    public void addtask(User u) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addtask'");
    }

    @Override
    public void updatetask(int taskid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatetask'");
    }

    @Override
    public List<User> displaytask() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displaytask'");
    }

    @Override
    public void deletetask(User u) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletetask'");
    }

    @Override
    public void searchtask(User u) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchtask'");
    }

    @Override
    public void assigntask(Vistor v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assigntask'");
    } 
}
