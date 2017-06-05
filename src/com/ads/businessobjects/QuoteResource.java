/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  javax.ws.rs.GET
 *  javax.ws.rs.Path
 *  javax.ws.rs.Produces
 *  javax.ws.rs.core.Response
 */
//package com.servicemesh.devops.demo.quickquote;
package com.ads.businessobjects;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path(value="/quote")
public class QuoteResource {
	
    @GET
    @Produces(value={"text/html"})
    public Response getInsuranceTypes() {
        List<String> insuranceTypes = this.getInsuranceTypeData();
        String listData = this.getInsuranceTypesData(insuranceTypes);
        return Response.ok((Object)listData).build();
    }

    public String getInsuranceTypesData(List<String> types) {
        StringBuilder buffer = new StringBuilder();
        String radio = "<input type=\"radio\" name=\"group1\" value=\"%s\">%s</input><br>";
        for (String insurance : types) {
            buffer.append(String.format(radio, insurance, insurance));
        }
        return buffer.toString();
    }

    public List<String> getInsuranceTypeData() {
        ArrayList<String> insuranceTypes = new ArrayList<String>();
        insuranceTypes.add("Auto");
        insuranceTypes.add("Marine");
        insuranceTypes.add("Life");
        insuranceTypes.add("Travel");
        insuranceTypes.add("Demo4-Insurence");
        insuranceTypes.add("Dryrun-demo");
        insuranceTypes.add("Health");
        return insuranceTypes;
    }
}