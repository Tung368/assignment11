package assignment11;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class EMPLOYEE implements IEMPLOYEE{
    protected String EmpID;
    protected String EmpName;
    protected Date EmpDateOfBirth;
    protected Date StartDate;

    public EMPLOYEE() {
    }

    public EMPLOYEE(String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
    
    public abstract void Input();
    
    public abstract void Output();
    
    public int CalculateSeniority() {
        LocalDate currentDate = LocalDate.now();
        LocalDate LocalDate = null;
        return Period.between(LocalDate, currentDate).getYears();
    }
}

