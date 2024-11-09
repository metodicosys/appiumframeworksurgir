package org.meto.api.endpoints;

public class Routes {
	public static String base_url_cobis="https://stg.api.authentication.saf-pe.cobiscloud.com";
	public static String base_url="https://api-apps.surgir.com.pe";
	public static String base_url_catalog="https://stg.api.admin.saf-pe.cobiscloud.com";
	
	public static String post_url_authentication = base_url_cobis+"/users/v1/auth/authentication";
	public static String post_url_role ="/users/v1/auth/authentication/role-selection";
	public static String port_url_rule_tasa = "/generic/v1/process-rules/rule-condition-values";
	public static String port_url_catalog_ecivil = "/generic/v1/admin/catalogs?name=cl_ecivil";
	
	//public static String post_url_experian = base_url+"/experian/qa/v1/informacion";
	
}
