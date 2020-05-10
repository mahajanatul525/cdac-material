package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class TourDAOImpl implements TourDAO{

	@Autowired
	HibernateTemplate template;
	
	@Override
	public void addTours(Tour ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List getTours() {
		// TODO Auto-generated method stub
		List<Tour> listt=template.find("from Tour");
		return listt;
	}

}
