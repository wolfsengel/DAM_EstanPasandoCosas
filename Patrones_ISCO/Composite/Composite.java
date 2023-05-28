import java.util.ArrayList;
import java.util.List;

interface Department {
	void printDepartmentName();
}
//--------------------------------------------------------------------------------------------------
class FinancialDepartment implements Department {
	private int id;
	private String name;
	public void printDepartmentName() {
		System.out.println(this.name);
	}
	// getter y setter de id y nombre
    public int getID() { return id; }
    public void setID(int newID) { id = newID; }
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

}
//--------------------------------------------------------------------------------------------------
class SalesDepartment implements Department {
	private Integer id;
	private String name;
	public void printDepartmentName() {
		System.out.println(this.name);
	}
	// getter y setter de id y nombre
    public int getID() { return id; }
    public void setID(int newID) { id = newID; }
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
}
//--------------------------------------------------------------------------------------------------
class HeadDepartment implements Department {
	private Integer id;
	private String name;
	private List<Department> childDepartments;
	HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}
	public void printDepartmentName() {
		childDepartments.forEach(Department::printDepartmentName);
	}
	public void addDepartment(Department department) {
		childDepartments.add(department);
	}
	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}
    // getter y setter de id y nombre
    public int getID() { return id; }
    public void setID(int newID) { id = newID; }
    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

}
public class Composite {
    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment(1, "Head Department");
        FinancialDepartment financialDepartment = new FinancialDepartment();
        financialDepartment.setID(11);
        financialDepartment.setName("Financial Department");
        SalesDepartment salesDepartment = new SalesDepartment();
        salesDepartment.setID(12);
        salesDepartment.setName("Sales Department");
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(salesDepartment);
        headDepartment.printDepartmentName();
    }
}