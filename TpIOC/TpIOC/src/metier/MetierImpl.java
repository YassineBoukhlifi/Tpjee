package metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import dao.IDao;


@Component("metier")
public class MetierImpl implements IMetier {
	//Couplage faible
	
	@Autowired
	private IDao dao;

	@Override
	public double calcul() {
		double data=dao.getData();
		double res=data*Math.PI;
		return res;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	

}
