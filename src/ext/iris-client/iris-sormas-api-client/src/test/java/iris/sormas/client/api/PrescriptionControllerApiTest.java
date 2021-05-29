/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.55.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package iris.sormas.client.api;

import org.junit.Test;
import org.junit.Ignore;

import iris.sormas.client.api.PrescriptionControllerApi;
import iris.sormas.client.model.PrescriptionDto;
import iris.sormas.client.model.PushResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrescriptionControllerApi
 */
@Ignore
public class PrescriptionControllerApiTest {

	private final PrescriptionControllerApi api = new PrescriptionControllerApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllActiveUuids6Test() {
		List<String> response = api.getAllActiveUuids6();

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getAllPrescriptionsTest() {
		Long since = null;
		List<PrescriptionDto> response = api.getAllPrescriptions(since);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void getByUuids20Test() {
		List<String> body = null;
		List<PrescriptionDto> response = api.getByUuids20(body);

		// TODO: test validations
	}

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void postPrescriptionsTest() {
		List<PrescriptionDto> body = null;
		List<PushResult> response = api.postPrescriptions(body);

		// TODO: test validations
	}
}