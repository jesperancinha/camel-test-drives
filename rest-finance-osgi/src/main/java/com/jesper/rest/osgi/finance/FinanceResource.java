package com.jesper.rest.osgi.finance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by joaofilipesabinoesperancinha on 17-08-16.
 */
@Path("test")
public class FinanceResource {

    @GET
    public String createFinance() {
        return "Let's start this finance thing";
    }
}
