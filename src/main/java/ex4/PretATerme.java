package ex4;

public class PretATerme implements Strategy {
	/** sert pour la méthode equals*/
	private String terme;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((terme == null) ? 0 : terme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PretATerme))
			return false;
		PretATerme other = (PretATerme) obj;
		if (terme == null) {
			if (other.terme != null)
				return false;
		} else if (!terme.equals(other.terme))
			return false;
		return true;
	}
	
}
