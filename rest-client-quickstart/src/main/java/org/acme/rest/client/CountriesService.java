package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

@Path("/v2") // FIXME needs to be duplicated
@RegisterRestClient
public interface CountriesService extends CountriesApi {
}
