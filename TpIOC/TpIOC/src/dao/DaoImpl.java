package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("Version base de donnees");
		double data=34;		
		return data;
	} 
	

}
