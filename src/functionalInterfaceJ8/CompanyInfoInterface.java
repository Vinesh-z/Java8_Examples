package functionalInterfaceJ8;

public interface CompanyInfoInterface {

	default String getCompanyInfo() {
		return "MyCompany";
	}
	
	static String getProjectVersion() {
		return "Beta v0.1";
	}
}
