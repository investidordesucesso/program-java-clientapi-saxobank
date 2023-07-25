/*
 * Saxobank trading API
 * Saxobank trading API
 *
 * OpenAPI spec version: 0.1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.AccountsMe;
import io.swagger.client.model.Balances;
import io.swagger.client.model.BalancesMe;
import java.math.BigDecimal;
import io.swagger.client.model.ClientsMe;
import io.swagger.client.model.InfoPrice;
import io.swagger.client.model.InstrumentDetail;
import io.swagger.client.model.Instruments;
import io.swagger.client.model.InstrumentsDetails;
import io.swagger.client.model.OrderActivities;
import io.swagger.client.model.OrderCancel;
import io.swagger.client.model.OrderPatchResponse;
import io.swagger.client.model.OrderQuery;
import io.swagger.client.model.OrderResponse;
import io.swagger.client.model.OrdersCancel;
import io.swagger.client.model.Positions;
import io.swagger.client.model.UsersMe;
import io.swagger.client.model.V2OrdersBody;
import io.swagger.client.model.V2OrdersBody1;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * 
     *
     * Query Order activities history
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiCsV1AuditOrderactivitiesGetTest() throws Exception {
        String skiptoken = null;
        Long top = null;
        String accountKey = null;
        String clientKey = null;
        String correlationKey = null;
        String entryType = null;
        String fieldGroups = null;
        String fromDateTime = null;
        Boolean includeSubAccounts = null;
        String orderId = null;
        String status = null;
        String toDateTime = null;
        OrderActivities response = api.openapiCsV1AuditOrderactivitiesGet(skiptoken, top, accountKey, clientKey, correlationKey, entryType, fieldGroups, fromDateTime, includeSubAccounts, orderId, status, toDateTime);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1AccountsMeGetTest() throws Exception {
        AccountsMe response = api.openapiPortV1AccountsMeGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1BalancesGetTest() throws Exception {
        String accountKey = null;
        String clientKey = null;
        Balances response = api.openapiPortV1BalancesGet(accountKey, clientKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1BalancesMeGetTest() throws Exception {
        BalancesMe response = api.openapiPortV1BalancesMeGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1ClientsMeGetTest() throws Exception {
        ClientsMe response = api.openapiPortV1ClientsMeGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get open orders
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1OrdersMeGetTest() throws Exception {
        String fieldGroups = null;
        OrderQuery response = api.openapiPortV1OrdersMeGet(fieldGroups);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of positions fulfilling the criteria specified by the query string parameters.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1PositionsGetTest() throws Exception {
        Long skip = null;
        Long top = null;
        String accountGroupKey = null;
        String accountKey = null;
        String clientKey = null;
        String fieldGroups = null;
        String netPositionId = null;
        String positionId = null;
        String watchlistId = null;
        Positions response = api.openapiPortV1PositionsGet(skip, top, accountGroupKey, accountKey, clientKey, fieldGroups, netPositionId, positionId, watchlistId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiPortV1UsersMeGetTest() throws Exception {
        UsersMe response = api.openapiPortV1UsersMeGet();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiRefV1InstrumentsDetailsGetTest() throws Exception {
        String accountKey = null;
        String assetTypes = null;
        String fieldGroups = null;
        String tags = null;
        BigDecimal uics = null;
        InstrumentsDetails response = api.openapiRefV1InstrumentsDetailsGet(accountKey, assetTypes, fieldGroups, tags, uics);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiRefV1InstrumentsDetailsUicAssetTypeGetTest() throws Exception {
        Long uic = null;
        String assetType = null;
        InstrumentDetail response = api.openapiRefV1InstrumentsDetailsUicAssetTypeGet(uic, assetType);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiRefV1InstrumentsGetTest() throws Exception {
        String keyWords = null;
        String assetTypes = null;
        String propertyClass = null;
        String exchangeId = null;
        BigDecimal uics = null;
        Instruments response = api.openapiRefV1InstrumentsGet(keyWords, assetTypes, propertyClass, exchangeId, uics);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiTradeV1InfopricesGetTest() throws Exception {
        Long uic = null;
        String assetType = null;
        String accountKey = null;
        InfoPrice response = api.openapiTradeV1InfopricesGet(uic, assetType, accountKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Cancels all orders for requested instrument and account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiTradeV2OrdersDeleteTest() throws Exception {
        String accountKey = null;
        String assetType = null;
        Long uic = null;
        OrdersCancel response = api.openapiTradeV2OrdersDelete(accountKey, assetType, uic);

        // TODO: test validations
    }
    /**
     * 
     *
     * Cancels one or more orders.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiTradeV2OrdersOrderIdsDeleteTest() throws Exception {
        Long orderIds = null;
        String accountKey = null;
        OrderCancel response = api.openapiTradeV2OrdersOrderIdsDelete(orderIds, accountKey);

        // TODO: test validations
    }
    /**
     * 
     *
     * Changes one or more existing orders.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiTradeV2OrdersPatchTest() throws Exception {
        V2OrdersBody1 body = null;
        OrderPatchResponse response = api.openapiTradeV2OrdersPatch(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Place a new order
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openapiTradeV2OrdersPostTest() throws Exception {
        V2OrdersBody body = null;
        OrderResponse response = api.openapiTradeV2OrdersPost(body);

        // TODO: test validations
    }
}
