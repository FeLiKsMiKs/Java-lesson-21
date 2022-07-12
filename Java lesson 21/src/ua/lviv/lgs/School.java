package ua.lviv.lgs;
import java.util.Objects;


public class School {
	@MyAnnotation (purpose = "This is the number of this school")
    private String schoolNumber;
    @MyAnnotation (purpose = "This is director name of this school")
    private int directorName;
    private int typeSchool;
	public School(String schoolNumber, int directorName, int typeSchool) {
		super();
		this.schoolNumber = schoolNumber;
		this.directorName = directorName;
		this.typeSchool = typeSchool;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public int getDirectorName() {
		return directorName;
	}
	public void setDirectorName(int directorName) {
		this.directorName = directorName;
	}
	public int getTypeSchool() {
		return typeSchool;
	}
	public void setTypeSchool(int typeSchool) {
		this.typeSchool = typeSchool;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(directorName, schoolNumber, typeSchool);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return directorName == other.directorName && Objects.equals(schoolNumber, other.schoolNumber)
				&& typeSchool == other.typeSchool;
	}

	@Override
	public String toString() {
		return "School [schoolNumber=" + schoolNumber + ", directorName=" + directorName
				+ ", typeSchool=" + typeSchool + "]";
	}
	
}
