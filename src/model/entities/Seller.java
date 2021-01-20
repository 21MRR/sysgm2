package model.entities;

import java.io.Serializable;


public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String qragm;
	private String matgm ;
	

	public Seller() {
	}

	public Seller(Integer id, String qragm,String matgm) {
		this.id = id;
		this.qragm = qragm;
		this.matgm = matgm;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQragm() {
		return qragm;
	}

	public void setName(String qragm) {
		this.qragm = qragm;
	}

	public String getMatgm() {
		return matgm;
	}

	public void setMatgm(String matgm) {
		this.matgm = matgm;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", qragm=" + qragm + ", matgm=" + matgm + "]";
	}
}
