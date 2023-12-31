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

package saxobank.home.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * AccountsMeData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T18:24:56.181779897Z[GMT]")

public class AccountsMeData {
  @SerializedName("AccountGroupKey")
  private String accountGroupKey = null;

  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("AccountKey")
  private String accountKey = null;

  @SerializedName("AccountSubType")
  private String accountSubType = null;

  @SerializedName("AccountType")
  private String accountType = null;

  @SerializedName("AccountValueProtectionLimit")
  private BigDecimal accountValueProtectionLimit = null;

  @SerializedName("Active")
  private Boolean active = null;

  @SerializedName("CanUseCashPositionsAsMarginCollateral")
  private Boolean canUseCashPositionsAsMarginCollateral = null;

  @SerializedName("CfdBorrowingCostsActive")
  private Boolean cfdBorrowingCostsActive = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("ClientKey")
  private String clientKey = null;

  @SerializedName("CreationDate")
  private String creationDate = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("CurrencyDecimals")
  private Long currencyDecimals = null;

  @SerializedName("DirectMarketAccess")
  private Boolean directMarketAccess = null;

  @SerializedName("FractionalOrderEnabled")
  private Boolean fractionalOrderEnabled = null;

  @SerializedName("FractionalOrderEnabledAssetTypes")
  private List<Object> fractionalOrderEnabledAssetTypes = null;

  @SerializedName("IndividualMargining")
  private Boolean individualMargining = null;

  @SerializedName("IsCurrencyConversionAtSettlementTime")
  private Boolean isCurrencyConversionAtSettlementTime = null;

  @SerializedName("IsMarginTradingAllowed")
  private Boolean isMarginTradingAllowed = null;

  @SerializedName("IsShareable")
  private Boolean isShareable = null;

  @SerializedName("IsTrialAccount")
  private Boolean isTrialAccount = null;

  @SerializedName("LegalAssetTypes")
  private List<String> legalAssetTypes = null;

  @SerializedName("ManagementType")
  private String managementType = null;

  @SerializedName("MarginCalculationMethod")
  private String marginCalculationMethod = null;

  @SerializedName("MarginLendingEnabled")
  private String marginLendingEnabled = null;

  @SerializedName("PortfolioBasedMarginEnabled")
  private Boolean portfolioBasedMarginEnabled = null;

  @SerializedName("Sharing")
  private List<String> sharing = null;

  @SerializedName("SupportsAccountValueProtectionLimit")
  private Boolean supportsAccountValueProtectionLimit = null;

  @SerializedName("UseCashPositionsAsMarginCollateral")
  private Boolean useCashPositionsAsMarginCollateral = null;

  public AccountsMeData accountGroupKey(String accountGroupKey) {
    this.accountGroupKey = accountGroupKey;
    return this;
  }

   /**
   * Get accountGroupKey
   * @return accountGroupKey
  **/
  @Schema(description = "")
  public String getAccountGroupKey() {
    return accountGroupKey;
  }

  public void setAccountGroupKey(String accountGroupKey) {
    this.accountGroupKey = accountGroupKey;
  }

  public AccountsMeData accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountsMeData accountKey(String accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @Schema(description = "")
  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }

  public AccountsMeData accountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

   /**
   * Get accountSubType
   * @return accountSubType
  **/
  @Schema(description = "")
  public String getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
  }

  public AccountsMeData accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public AccountsMeData accountValueProtectionLimit(BigDecimal accountValueProtectionLimit) {
    this.accountValueProtectionLimit = accountValueProtectionLimit;
    return this;
  }

   /**
   * Get accountValueProtectionLimit
   * @return accountValueProtectionLimit
  **/
  @Schema(description = "")
  public BigDecimal getAccountValueProtectionLimit() {
    return accountValueProtectionLimit;
  }

  public void setAccountValueProtectionLimit(BigDecimal accountValueProtectionLimit) {
    this.accountValueProtectionLimit = accountValueProtectionLimit;
  }

  public AccountsMeData active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public AccountsMeData canUseCashPositionsAsMarginCollateral(Boolean canUseCashPositionsAsMarginCollateral) {
    this.canUseCashPositionsAsMarginCollateral = canUseCashPositionsAsMarginCollateral;
    return this;
  }

   /**
   * Get canUseCashPositionsAsMarginCollateral
   * @return canUseCashPositionsAsMarginCollateral
  **/
  @Schema(description = "")
  public Boolean isCanUseCashPositionsAsMarginCollateral() {
    return canUseCashPositionsAsMarginCollateral;
  }

  public void setCanUseCashPositionsAsMarginCollateral(Boolean canUseCashPositionsAsMarginCollateral) {
    this.canUseCashPositionsAsMarginCollateral = canUseCashPositionsAsMarginCollateral;
  }

  public AccountsMeData cfdBorrowingCostsActive(Boolean cfdBorrowingCostsActive) {
    this.cfdBorrowingCostsActive = cfdBorrowingCostsActive;
    return this;
  }

   /**
   * Get cfdBorrowingCostsActive
   * @return cfdBorrowingCostsActive
  **/
  @Schema(description = "")
  public Boolean isCfdBorrowingCostsActive() {
    return cfdBorrowingCostsActive;
  }

  public void setCfdBorrowingCostsActive(Boolean cfdBorrowingCostsActive) {
    this.cfdBorrowingCostsActive = cfdBorrowingCostsActive;
  }

  public AccountsMeData clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AccountsMeData clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Get clientKey
   * @return clientKey
  **/
  @Schema(description = "")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public AccountsMeData creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @Schema(description = "")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public AccountsMeData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountsMeData currencyDecimals(Long currencyDecimals) {
    this.currencyDecimals = currencyDecimals;
    return this;
  }

   /**
   * Get currencyDecimals
   * @return currencyDecimals
  **/
  @Schema(description = "")
  public Long getCurrencyDecimals() {
    return currencyDecimals;
  }

  public void setCurrencyDecimals(Long currencyDecimals) {
    this.currencyDecimals = currencyDecimals;
  }

  public AccountsMeData directMarketAccess(Boolean directMarketAccess) {
    this.directMarketAccess = directMarketAccess;
    return this;
  }

   /**
   * Get directMarketAccess
   * @return directMarketAccess
  **/
  @Schema(description = "")
  public Boolean isDirectMarketAccess() {
    return directMarketAccess;
  }

  public void setDirectMarketAccess(Boolean directMarketAccess) {
    this.directMarketAccess = directMarketAccess;
  }

  public AccountsMeData fractionalOrderEnabled(Boolean fractionalOrderEnabled) {
    this.fractionalOrderEnabled = fractionalOrderEnabled;
    return this;
  }

   /**
   * Get fractionalOrderEnabled
   * @return fractionalOrderEnabled
  **/
  @Schema(description = "")
  public Boolean isFractionalOrderEnabled() {
    return fractionalOrderEnabled;
  }

  public void setFractionalOrderEnabled(Boolean fractionalOrderEnabled) {
    this.fractionalOrderEnabled = fractionalOrderEnabled;
  }

  public AccountsMeData fractionalOrderEnabledAssetTypes(List<Object> fractionalOrderEnabledAssetTypes) {
    this.fractionalOrderEnabledAssetTypes = fractionalOrderEnabledAssetTypes;
    return this;
  }

  public AccountsMeData addFractionalOrderEnabledAssetTypesItem(Object fractionalOrderEnabledAssetTypesItem) {
    if (this.fractionalOrderEnabledAssetTypes == null) {
      this.fractionalOrderEnabledAssetTypes = new ArrayList<Object>();
    }
    this.fractionalOrderEnabledAssetTypes.add(fractionalOrderEnabledAssetTypesItem);
    return this;
  }

   /**
   * Get fractionalOrderEnabledAssetTypes
   * @return fractionalOrderEnabledAssetTypes
  **/
  @Schema(description = "")
  public List<Object> getFractionalOrderEnabledAssetTypes() {
    return fractionalOrderEnabledAssetTypes;
  }

  public void setFractionalOrderEnabledAssetTypes(List<Object> fractionalOrderEnabledAssetTypes) {
    this.fractionalOrderEnabledAssetTypes = fractionalOrderEnabledAssetTypes;
  }

  public AccountsMeData individualMargining(Boolean individualMargining) {
    this.individualMargining = individualMargining;
    return this;
  }

   /**
   * Get individualMargining
   * @return individualMargining
  **/
  @Schema(description = "")
  public Boolean isIndividualMargining() {
    return individualMargining;
  }

  public void setIndividualMargining(Boolean individualMargining) {
    this.individualMargining = individualMargining;
  }

  public AccountsMeData isCurrencyConversionAtSettlementTime(Boolean isCurrencyConversionAtSettlementTime) {
    this.isCurrencyConversionAtSettlementTime = isCurrencyConversionAtSettlementTime;
    return this;
  }

   /**
   * Get isCurrencyConversionAtSettlementTime
   * @return isCurrencyConversionAtSettlementTime
  **/
  @Schema(description = "")
  public Boolean isIsCurrencyConversionAtSettlementTime() {
    return isCurrencyConversionAtSettlementTime;
  }

  public void setIsCurrencyConversionAtSettlementTime(Boolean isCurrencyConversionAtSettlementTime) {
    this.isCurrencyConversionAtSettlementTime = isCurrencyConversionAtSettlementTime;
  }

  public AccountsMeData isMarginTradingAllowed(Boolean isMarginTradingAllowed) {
    this.isMarginTradingAllowed = isMarginTradingAllowed;
    return this;
  }

   /**
   * Get isMarginTradingAllowed
   * @return isMarginTradingAllowed
  **/
  @Schema(description = "")
  public Boolean isIsMarginTradingAllowed() {
    return isMarginTradingAllowed;
  }

  public void setIsMarginTradingAllowed(Boolean isMarginTradingAllowed) {
    this.isMarginTradingAllowed = isMarginTradingAllowed;
  }

  public AccountsMeData isShareable(Boolean isShareable) {
    this.isShareable = isShareable;
    return this;
  }

   /**
   * Get isShareable
   * @return isShareable
  **/
  @Schema(description = "")
  public Boolean isIsShareable() {
    return isShareable;
  }

  public void setIsShareable(Boolean isShareable) {
    this.isShareable = isShareable;
  }

  public AccountsMeData isTrialAccount(Boolean isTrialAccount) {
    this.isTrialAccount = isTrialAccount;
    return this;
  }

   /**
   * Get isTrialAccount
   * @return isTrialAccount
  **/
  @Schema(description = "")
  public Boolean isIsTrialAccount() {
    return isTrialAccount;
  }

  public void setIsTrialAccount(Boolean isTrialAccount) {
    this.isTrialAccount = isTrialAccount;
  }

  public AccountsMeData legalAssetTypes(List<String> legalAssetTypes) {
    this.legalAssetTypes = legalAssetTypes;
    return this;
  }

  public AccountsMeData addLegalAssetTypesItem(String legalAssetTypesItem) {
    if (this.legalAssetTypes == null) {
      this.legalAssetTypes = new ArrayList<String>();
    }
    this.legalAssetTypes.add(legalAssetTypesItem);
    return this;
  }

   /**
   * Get legalAssetTypes
   * @return legalAssetTypes
  **/
  @Schema(description = "")
  public List<String> getLegalAssetTypes() {
    return legalAssetTypes;
  }

  public void setLegalAssetTypes(List<String> legalAssetTypes) {
    this.legalAssetTypes = legalAssetTypes;
  }

  public AccountsMeData managementType(String managementType) {
    this.managementType = managementType;
    return this;
  }

   /**
   * Get managementType
   * @return managementType
  **/
  @Schema(description = "")
  public String getManagementType() {
    return managementType;
  }

  public void setManagementType(String managementType) {
    this.managementType = managementType;
  }

  public AccountsMeData marginCalculationMethod(String marginCalculationMethod) {
    this.marginCalculationMethod = marginCalculationMethod;
    return this;
  }

   /**
   * Get marginCalculationMethod
   * @return marginCalculationMethod
  **/
  @Schema(description = "")
  public String getMarginCalculationMethod() {
    return marginCalculationMethod;
  }

  public void setMarginCalculationMethod(String marginCalculationMethod) {
    this.marginCalculationMethod = marginCalculationMethod;
  }

  public AccountsMeData marginLendingEnabled(String marginLendingEnabled) {
    this.marginLendingEnabled = marginLendingEnabled;
    return this;
  }

   /**
   * Get marginLendingEnabled
   * @return marginLendingEnabled
  **/
  @Schema(description = "")
  public String getMarginLendingEnabled() {
    return marginLendingEnabled;
  }

  public void setMarginLendingEnabled(String marginLendingEnabled) {
    this.marginLendingEnabled = marginLendingEnabled;
  }

  public AccountsMeData portfolioBasedMarginEnabled(Boolean portfolioBasedMarginEnabled) {
    this.portfolioBasedMarginEnabled = portfolioBasedMarginEnabled;
    return this;
  }

   /**
   * Get portfolioBasedMarginEnabled
   * @return portfolioBasedMarginEnabled
  **/
  @Schema(description = "")
  public Boolean isPortfolioBasedMarginEnabled() {
    return portfolioBasedMarginEnabled;
  }

  public void setPortfolioBasedMarginEnabled(Boolean portfolioBasedMarginEnabled) {
    this.portfolioBasedMarginEnabled = portfolioBasedMarginEnabled;
  }

  public AccountsMeData sharing(List<String> sharing) {
    this.sharing = sharing;
    return this;
  }

  public AccountsMeData addSharingItem(String sharingItem) {
    if (this.sharing == null) {
      this.sharing = new ArrayList<String>();
    }
    this.sharing.add(sharingItem);
    return this;
  }

   /**
   * Get sharing
   * @return sharing
  **/
  @Schema(description = "")
  public List<String> getSharing() {
    return sharing;
  }

  public void setSharing(List<String> sharing) {
    this.sharing = sharing;
  }

  public AccountsMeData supportsAccountValueProtectionLimit(Boolean supportsAccountValueProtectionLimit) {
    this.supportsAccountValueProtectionLimit = supportsAccountValueProtectionLimit;
    return this;
  }

   /**
   * Get supportsAccountValueProtectionLimit
   * @return supportsAccountValueProtectionLimit
  **/
  @Schema(description = "")
  public Boolean isSupportsAccountValueProtectionLimit() {
    return supportsAccountValueProtectionLimit;
  }

  public void setSupportsAccountValueProtectionLimit(Boolean supportsAccountValueProtectionLimit) {
    this.supportsAccountValueProtectionLimit = supportsAccountValueProtectionLimit;
  }

  public AccountsMeData useCashPositionsAsMarginCollateral(Boolean useCashPositionsAsMarginCollateral) {
    this.useCashPositionsAsMarginCollateral = useCashPositionsAsMarginCollateral;
    return this;
  }

   /**
   * Get useCashPositionsAsMarginCollateral
   * @return useCashPositionsAsMarginCollateral
  **/
  @Schema(description = "")
  public Boolean isUseCashPositionsAsMarginCollateral() {
    return useCashPositionsAsMarginCollateral;
  }

  public void setUseCashPositionsAsMarginCollateral(Boolean useCashPositionsAsMarginCollateral) {
    this.useCashPositionsAsMarginCollateral = useCashPositionsAsMarginCollateral;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsMeData accountsMeData = (AccountsMeData) o;
    return Objects.equals(this.accountGroupKey, accountsMeData.accountGroupKey) &&
        Objects.equals(this.accountId, accountsMeData.accountId) &&
        Objects.equals(this.accountKey, accountsMeData.accountKey) &&
        Objects.equals(this.accountSubType, accountsMeData.accountSubType) &&
        Objects.equals(this.accountType, accountsMeData.accountType) &&
        Objects.equals(this.accountValueProtectionLimit, accountsMeData.accountValueProtectionLimit) &&
        Objects.equals(this.active, accountsMeData.active) &&
        Objects.equals(this.canUseCashPositionsAsMarginCollateral, accountsMeData.canUseCashPositionsAsMarginCollateral) &&
        Objects.equals(this.cfdBorrowingCostsActive, accountsMeData.cfdBorrowingCostsActive) &&
        Objects.equals(this.clientId, accountsMeData.clientId) &&
        Objects.equals(this.clientKey, accountsMeData.clientKey) &&
        Objects.equals(this.creationDate, accountsMeData.creationDate) &&
        Objects.equals(this.currency, accountsMeData.currency) &&
        Objects.equals(this.currencyDecimals, accountsMeData.currencyDecimals) &&
        Objects.equals(this.directMarketAccess, accountsMeData.directMarketAccess) &&
        Objects.equals(this.fractionalOrderEnabled, accountsMeData.fractionalOrderEnabled) &&
        Objects.equals(this.fractionalOrderEnabledAssetTypes, accountsMeData.fractionalOrderEnabledAssetTypes) &&
        Objects.equals(this.individualMargining, accountsMeData.individualMargining) &&
        Objects.equals(this.isCurrencyConversionAtSettlementTime, accountsMeData.isCurrencyConversionAtSettlementTime) &&
        Objects.equals(this.isMarginTradingAllowed, accountsMeData.isMarginTradingAllowed) &&
        Objects.equals(this.isShareable, accountsMeData.isShareable) &&
        Objects.equals(this.isTrialAccount, accountsMeData.isTrialAccount) &&
        Objects.equals(this.legalAssetTypes, accountsMeData.legalAssetTypes) &&
        Objects.equals(this.managementType, accountsMeData.managementType) &&
        Objects.equals(this.marginCalculationMethod, accountsMeData.marginCalculationMethod) &&
        Objects.equals(this.marginLendingEnabled, accountsMeData.marginLendingEnabled) &&
        Objects.equals(this.portfolioBasedMarginEnabled, accountsMeData.portfolioBasedMarginEnabled) &&
        Objects.equals(this.sharing, accountsMeData.sharing) &&
        Objects.equals(this.supportsAccountValueProtectionLimit, accountsMeData.supportsAccountValueProtectionLimit) &&
        Objects.equals(this.useCashPositionsAsMarginCollateral, accountsMeData.useCashPositionsAsMarginCollateral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupKey, accountId, accountKey, accountSubType, accountType, accountValueProtectionLimit, active, canUseCashPositionsAsMarginCollateral, cfdBorrowingCostsActive, clientId, clientKey, creationDate, currency, currencyDecimals, directMarketAccess, fractionalOrderEnabled, fractionalOrderEnabledAssetTypes, individualMargining, isCurrencyConversionAtSettlementTime, isMarginTradingAllowed, isShareable, isTrialAccount, legalAssetTypes, managementType, marginCalculationMethod, marginLendingEnabled, portfolioBasedMarginEnabled, sharing, supportsAccountValueProtectionLimit, useCashPositionsAsMarginCollateral);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsMeData {\n");
    
    sb.append("    accountGroupKey: ").append(toIndentedString(accountGroupKey)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountValueProtectionLimit: ").append(toIndentedString(accountValueProtectionLimit)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    canUseCashPositionsAsMarginCollateral: ").append(toIndentedString(canUseCashPositionsAsMarginCollateral)).append("\n");
    sb.append("    cfdBorrowingCostsActive: ").append(toIndentedString(cfdBorrowingCostsActive)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyDecimals: ").append(toIndentedString(currencyDecimals)).append("\n");
    sb.append("    directMarketAccess: ").append(toIndentedString(directMarketAccess)).append("\n");
    sb.append("    fractionalOrderEnabled: ").append(toIndentedString(fractionalOrderEnabled)).append("\n");
    sb.append("    fractionalOrderEnabledAssetTypes: ").append(toIndentedString(fractionalOrderEnabledAssetTypes)).append("\n");
    sb.append("    individualMargining: ").append(toIndentedString(individualMargining)).append("\n");
    sb.append("    isCurrencyConversionAtSettlementTime: ").append(toIndentedString(isCurrencyConversionAtSettlementTime)).append("\n");
    sb.append("    isMarginTradingAllowed: ").append(toIndentedString(isMarginTradingAllowed)).append("\n");
    sb.append("    isShareable: ").append(toIndentedString(isShareable)).append("\n");
    sb.append("    isTrialAccount: ").append(toIndentedString(isTrialAccount)).append("\n");
    sb.append("    legalAssetTypes: ").append(toIndentedString(legalAssetTypes)).append("\n");
    sb.append("    managementType: ").append(toIndentedString(managementType)).append("\n");
    sb.append("    marginCalculationMethod: ").append(toIndentedString(marginCalculationMethod)).append("\n");
    sb.append("    marginLendingEnabled: ").append(toIndentedString(marginLendingEnabled)).append("\n");
    sb.append("    portfolioBasedMarginEnabled: ").append(toIndentedString(portfolioBasedMarginEnabled)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    supportsAccountValueProtectionLimit: ").append(toIndentedString(supportsAccountValueProtectionLimit)).append("\n");
    sb.append("    useCashPositionsAsMarginCollateral: ").append(toIndentedString(useCashPositionsAsMarginCollateral)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
