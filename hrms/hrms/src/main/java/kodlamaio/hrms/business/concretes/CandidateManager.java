package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.hrms.entities.concretes.Candidates;

public class CandidateManager implements CandidateService {

	@Autowired
	private CandidatesDao candidatesDao;
	public CandidateManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}
	@Override
	public List<Candidates> getAll() {
		// TODO Auto-generated method stub
		return this.candidatesDao.findAll();
	}

}
