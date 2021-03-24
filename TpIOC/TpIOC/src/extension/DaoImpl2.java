package extension;

import org.springframework.stereotype.Component;

import dao.IDao;
@Component
public class DaoImpl2 implements IDao{

	@Override
	public double getData() {
		// Version Web Service 
		System.out.println("Version Web Service");
		double data=38;
		return data;
	}

}
