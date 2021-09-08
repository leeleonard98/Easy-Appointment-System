
package ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetrieveAppointmentByAppointmentNo_QNAME = new QName("http://ws.session.ejb/", "retrieveAppointmentByAppointmentNo");
    private final static QName _RetrieveAllBusinessCategories_QNAME = new QName("http://ws.session.ejb/", "retrieveAllBusinessCategories");
    private final static QName _CancelAppointmentResponse_QNAME = new QName("http://ws.session.ejb/", "cancelAppointmentResponse");
    private final static QName _RetrieveServiceProvidersByCategoryIdAndCityResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProvidersByCategoryIdAndCityResponse");
    private final static QName _RetrieveAllBusinessCategoriesResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveAllBusinessCategoriesResponse");
    private final static QName _RetrieveServiceProvidersByCategoryIdAndCity_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProvidersByCategoryIdAndCity");
    private final static QName _RegisterCustomerResponse_QNAME = new QName("http://ws.session.ejb/", "registerCustomerResponse");
    private final static QName _CustomerAlreadyExistsException_QNAME = new QName("http://ws.session.ejb/", "CustomerAlreadyExistsException");
    private final static QName _AppointmentNotFoundException_QNAME = new QName("http://ws.session.ejb/", "AppointmentNotFoundException");
    private final static QName _UnknownPersistenceException_QNAME = new QName("http://ws.session.ejb/", "UnknownPersistenceException");
    private final static QName _UnauthorisedOperationException_QNAME = new QName("http://ws.session.ejb/", "UnauthorisedOperationException");
    private final static QName _RetrieveServiceProviderByProviderId_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProviderByProviderId");
    private final static QName _RateServiceProviderResponse_QNAME = new QName("http://ws.session.ejb/", "rateServiceProviderResponse");
    private final static QName _CustomerLogin_QNAME = new QName("http://ws.session.ejb/", "customerLogin");
    private final static QName _RetrieveServiceProviderAppointmentsResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProviderAppointmentsResponse");
    private final static QName _ServiceProviderNotFoundException_QNAME = new QName("http://ws.session.ejb/", "ServiceProviderNotFoundException");
    private final static QName _RetrieveAppointmentByAppointmentNoResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveAppointmentByAppointmentNoResponse");
    private final static QName _RateServiceProvider_QNAME = new QName("http://ws.session.ejb/", "rateServiceProvider");
    private final static QName _RegisterCustomer_QNAME = new QName("http://ws.session.ejb/", "registerCustomer");
    private final static QName _InputDataValidationException_QNAME = new QName("http://ws.session.ejb/", "InputDataValidationException");
    private final static QName _BusinessCategoryNotFoundException_QNAME = new QName("http://ws.session.ejb/", "BusinessCategoryNotFoundException");
    private final static QName _InvalidLoginException_QNAME = new QName("http://ws.session.ejb/", "InvalidLoginException");
    private final static QName _RetrieveServiceProviderByProviderIdResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProviderByProviderIdResponse");
    private final static QName _CreateNewAppointmentEntityException_QNAME = new QName("http://ws.session.ejb/", "CreateNewAppointmentEntityException");
    private final static QName _CustomerNotFoundException_QNAME = new QName("http://ws.session.ejb/", "CustomerNotFoundException");
    private final static QName _AddAppointmentResponse_QNAME = new QName("http://ws.session.ejb/", "addAppointmentResponse");
    private final static QName _CustomerLoginResponse_QNAME = new QName("http://ws.session.ejb/", "customerLoginResponse");
    private final static QName _RetrieveCustomerAppointments_QNAME = new QName("http://ws.session.ejb/", "retrieveCustomerAppointments");
    private final static QName _RetrieveCustomerAppointmentsResponse_QNAME = new QName("http://ws.session.ejb/", "retrieveCustomerAppointmentsResponse");
    private final static QName _CancelAppointment_QNAME = new QName("http://ws.session.ejb/", "cancelAppointment");
    private final static QName _RetrieveServiceProviderAppointments_QNAME = new QName("http://ws.session.ejb/", "retrieveServiceProviderAppointments");
    private final static QName _AddAppointment_QNAME = new QName("http://ws.session.ejb/", "addAppointment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnauthorisedOperationException }
     * 
     */
    public UnauthorisedOperationException createUnauthorisedOperationException() {
        return new UnauthorisedOperationException();
    }

    /**
     * Create an instance of {@link RetrieveServiceProviderByProviderId }
     * 
     */
    public RetrieveServiceProviderByProviderId createRetrieveServiceProviderByProviderId() {
        return new RetrieveServiceProviderByProviderId();
    }

    /**
     * Create an instance of {@link RateServiceProviderResponse }
     * 
     */
    public RateServiceProviderResponse createRateServiceProviderResponse() {
        return new RateServiceProviderResponse();
    }

    /**
     * Create an instance of {@link CustomerLogin }
     * 
     */
    public CustomerLogin createCustomerLogin() {
        return new CustomerLogin();
    }

    /**
     * Create an instance of {@link RetrieveAllBusinessCategoriesResponse }
     * 
     */
    public RetrieveAllBusinessCategoriesResponse createRetrieveAllBusinessCategoriesResponse() {
        return new RetrieveAllBusinessCategoriesResponse();
    }

    /**
     * Create an instance of {@link RetrieveServiceProvidersByCategoryIdAndCity }
     * 
     */
    public RetrieveServiceProvidersByCategoryIdAndCity createRetrieveServiceProvidersByCategoryIdAndCity() {
        return new RetrieveServiceProvidersByCategoryIdAndCity();
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link CustomerAlreadyExistsException }
     * 
     */
    public CustomerAlreadyExistsException createCustomerAlreadyExistsException() {
        return new CustomerAlreadyExistsException();
    }

    /**
     * Create an instance of {@link AppointmentNotFoundException }
     * 
     */
    public AppointmentNotFoundException createAppointmentNotFoundException() {
        return new AppointmentNotFoundException();
    }

    /**
     * Create an instance of {@link UnknownPersistenceException }
     * 
     */
    public UnknownPersistenceException createUnknownPersistenceException() {
        return new UnknownPersistenceException();
    }

    /**
     * Create an instance of {@link RetrieveAppointmentByAppointmentNo }
     * 
     */
    public RetrieveAppointmentByAppointmentNo createRetrieveAppointmentByAppointmentNo() {
        return new RetrieveAppointmentByAppointmentNo();
    }

    /**
     * Create an instance of {@link RetrieveAllBusinessCategories }
     * 
     */
    public RetrieveAllBusinessCategories createRetrieveAllBusinessCategories() {
        return new RetrieveAllBusinessCategories();
    }

    /**
     * Create an instance of {@link CancelAppointmentResponse }
     * 
     */
    public CancelAppointmentResponse createCancelAppointmentResponse() {
        return new CancelAppointmentResponse();
    }

    /**
     * Create an instance of {@link RetrieveServiceProvidersByCategoryIdAndCityResponse }
     * 
     */
    public RetrieveServiceProvidersByCategoryIdAndCityResponse createRetrieveServiceProvidersByCategoryIdAndCityResponse() {
        return new RetrieveServiceProvidersByCategoryIdAndCityResponse();
    }

    /**
     * Create an instance of {@link CancelAppointment }
     * 
     */
    public CancelAppointment createCancelAppointment() {
        return new CancelAppointment();
    }

    /**
     * Create an instance of {@link RetrieveServiceProviderAppointments }
     * 
     */
    public RetrieveServiceProviderAppointments createRetrieveServiceProviderAppointments() {
        return new RetrieveServiceProviderAppointments();
    }

    /**
     * Create an instance of {@link AddAppointment }
     * 
     */
    public AddAppointment createAddAppointment() {
        return new AddAppointment();
    }

    /**
     * Create an instance of {@link RetrieveServiceProviderByProviderIdResponse }
     * 
     */
    public RetrieveServiceProviderByProviderIdResponse createRetrieveServiceProviderByProviderIdResponse() {
        return new RetrieveServiceProviderByProviderIdResponse();
    }

    /**
     * Create an instance of {@link CreateNewAppointmentEntityException }
     * 
     */
    public CreateNewAppointmentEntityException createCreateNewAppointmentEntityException() {
        return new CreateNewAppointmentEntityException();
    }

    /**
     * Create an instance of {@link CustomerNotFoundException }
     * 
     */
    public CustomerNotFoundException createCustomerNotFoundException() {
        return new CustomerNotFoundException();
    }

    /**
     * Create an instance of {@link AddAppointmentResponse }
     * 
     */
    public AddAppointmentResponse createAddAppointmentResponse() {
        return new AddAppointmentResponse();
    }

    /**
     * Create an instance of {@link CustomerLoginResponse }
     * 
     */
    public CustomerLoginResponse createCustomerLoginResponse() {
        return new CustomerLoginResponse();
    }

    /**
     * Create an instance of {@link RetrieveCustomerAppointments }
     * 
     */
    public RetrieveCustomerAppointments createRetrieveCustomerAppointments() {
        return new RetrieveCustomerAppointments();
    }

    /**
     * Create an instance of {@link RetrieveCustomerAppointmentsResponse }
     * 
     */
    public RetrieveCustomerAppointmentsResponse createRetrieveCustomerAppointmentsResponse() {
        return new RetrieveCustomerAppointmentsResponse();
    }

    /**
     * Create an instance of {@link BusinessCategoryNotFoundException }
     * 
     */
    public BusinessCategoryNotFoundException createBusinessCategoryNotFoundException() {
        return new BusinessCategoryNotFoundException();
    }

    /**
     * Create an instance of {@link InvalidLoginException }
     * 
     */
    public InvalidLoginException createInvalidLoginException() {
        return new InvalidLoginException();
    }

    /**
     * Create an instance of {@link RetrieveServiceProviderAppointmentsResponse }
     * 
     */
    public RetrieveServiceProviderAppointmentsResponse createRetrieveServiceProviderAppointmentsResponse() {
        return new RetrieveServiceProviderAppointmentsResponse();
    }

    /**
     * Create an instance of {@link ServiceProviderNotFoundException }
     * 
     */
    public ServiceProviderNotFoundException createServiceProviderNotFoundException() {
        return new ServiceProviderNotFoundException();
    }

    /**
     * Create an instance of {@link RetrieveAppointmentByAppointmentNoResponse }
     * 
     */
    public RetrieveAppointmentByAppointmentNoResponse createRetrieveAppointmentByAppointmentNoResponse() {
        return new RetrieveAppointmentByAppointmentNoResponse();
    }

    /**
     * Create an instance of {@link RateServiceProvider }
     * 
     */
    public RateServiceProvider createRateServiceProvider() {
        return new RateServiceProvider();
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link InputDataValidationException }
     * 
     */
    public InputDataValidationException createInputDataValidationException() {
        return new InputDataValidationException();
    }

    /**
     * Create an instance of {@link AppointmentEntity }
     * 
     */
    public AppointmentEntity createAppointmentEntity() {
        return new AppointmentEntity();
    }

    /**
     * Create an instance of {@link CustomerEntity }
     * 
     */
    public CustomerEntity createCustomerEntity() {
        return new CustomerEntity();
    }

    /**
     * Create an instance of {@link BusinessCategoryEntity }
     * 
     */
    public BusinessCategoryEntity createBusinessCategoryEntity() {
        return new BusinessCategoryEntity();
    }

    /**
     * Create an instance of {@link ServiceProviderEntity }
     * 
     */
    public ServiceProviderEntity createServiceProviderEntity() {
        return new ServiceProviderEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAppointmentByAppointmentNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAppointmentByAppointmentNo")
    public JAXBElement<RetrieveAppointmentByAppointmentNo> createRetrieveAppointmentByAppointmentNo(RetrieveAppointmentByAppointmentNo value) {
        return new JAXBElement<RetrieveAppointmentByAppointmentNo>(_RetrieveAppointmentByAppointmentNo_QNAME, RetrieveAppointmentByAppointmentNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllBusinessCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllBusinessCategories")
    public JAXBElement<RetrieveAllBusinessCategories> createRetrieveAllBusinessCategories(RetrieveAllBusinessCategories value) {
        return new JAXBElement<RetrieveAllBusinessCategories>(_RetrieveAllBusinessCategories_QNAME, RetrieveAllBusinessCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAppointmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "cancelAppointmentResponse")
    public JAXBElement<CancelAppointmentResponse> createCancelAppointmentResponse(CancelAppointmentResponse value) {
        return new JAXBElement<CancelAppointmentResponse>(_CancelAppointmentResponse_QNAME, CancelAppointmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProvidersByCategoryIdAndCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProvidersByCategoryIdAndCityResponse")
    public JAXBElement<RetrieveServiceProvidersByCategoryIdAndCityResponse> createRetrieveServiceProvidersByCategoryIdAndCityResponse(RetrieveServiceProvidersByCategoryIdAndCityResponse value) {
        return new JAXBElement<RetrieveServiceProvidersByCategoryIdAndCityResponse>(_RetrieveServiceProvidersByCategoryIdAndCityResponse_QNAME, RetrieveServiceProvidersByCategoryIdAndCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAllBusinessCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAllBusinessCategoriesResponse")
    public JAXBElement<RetrieveAllBusinessCategoriesResponse> createRetrieveAllBusinessCategoriesResponse(RetrieveAllBusinessCategoriesResponse value) {
        return new JAXBElement<RetrieveAllBusinessCategoriesResponse>(_RetrieveAllBusinessCategoriesResponse_QNAME, RetrieveAllBusinessCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProvidersByCategoryIdAndCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProvidersByCategoryIdAndCity")
    public JAXBElement<RetrieveServiceProvidersByCategoryIdAndCity> createRetrieveServiceProvidersByCategoryIdAndCity(RetrieveServiceProvidersByCategoryIdAndCity value) {
        return new JAXBElement<RetrieveServiceProvidersByCategoryIdAndCity>(_RetrieveServiceProvidersByCategoryIdAndCity_QNAME, RetrieveServiceProvidersByCategoryIdAndCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "registerCustomerResponse")
    public JAXBElement<RegisterCustomerResponse> createRegisterCustomerResponse(RegisterCustomerResponse value) {
        return new JAXBElement<RegisterCustomerResponse>(_RegisterCustomerResponse_QNAME, RegisterCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAlreadyExistsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "CustomerAlreadyExistsException")
    public JAXBElement<CustomerAlreadyExistsException> createCustomerAlreadyExistsException(CustomerAlreadyExistsException value) {
        return new JAXBElement<CustomerAlreadyExistsException>(_CustomerAlreadyExistsException_QNAME, CustomerAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppointmentNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "AppointmentNotFoundException")
    public JAXBElement<AppointmentNotFoundException> createAppointmentNotFoundException(AppointmentNotFoundException value) {
        return new JAXBElement<AppointmentNotFoundException>(_AppointmentNotFoundException_QNAME, AppointmentNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownPersistenceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "UnknownPersistenceException")
    public JAXBElement<UnknownPersistenceException> createUnknownPersistenceException(UnknownPersistenceException value) {
        return new JAXBElement<UnknownPersistenceException>(_UnknownPersistenceException_QNAME, UnknownPersistenceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnauthorisedOperationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "UnauthorisedOperationException")
    public JAXBElement<UnauthorisedOperationException> createUnauthorisedOperationException(UnauthorisedOperationException value) {
        return new JAXBElement<UnauthorisedOperationException>(_UnauthorisedOperationException_QNAME, UnauthorisedOperationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProviderByProviderId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProviderByProviderId")
    public JAXBElement<RetrieveServiceProviderByProviderId> createRetrieveServiceProviderByProviderId(RetrieveServiceProviderByProviderId value) {
        return new JAXBElement<RetrieveServiceProviderByProviderId>(_RetrieveServiceProviderByProviderId_QNAME, RetrieveServiceProviderByProviderId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateServiceProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "rateServiceProviderResponse")
    public JAXBElement<RateServiceProviderResponse> createRateServiceProviderResponse(RateServiceProviderResponse value) {
        return new JAXBElement<RateServiceProviderResponse>(_RateServiceProviderResponse_QNAME, RateServiceProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "customerLogin")
    public JAXBElement<CustomerLogin> createCustomerLogin(CustomerLogin value) {
        return new JAXBElement<CustomerLogin>(_CustomerLogin_QNAME, CustomerLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProviderAppointmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProviderAppointmentsResponse")
    public JAXBElement<RetrieveServiceProviderAppointmentsResponse> createRetrieveServiceProviderAppointmentsResponse(RetrieveServiceProviderAppointmentsResponse value) {
        return new JAXBElement<RetrieveServiceProviderAppointmentsResponse>(_RetrieveServiceProviderAppointmentsResponse_QNAME, RetrieveServiceProviderAppointmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProviderNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "ServiceProviderNotFoundException")
    public JAXBElement<ServiceProviderNotFoundException> createServiceProviderNotFoundException(ServiceProviderNotFoundException value) {
        return new JAXBElement<ServiceProviderNotFoundException>(_ServiceProviderNotFoundException_QNAME, ServiceProviderNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAppointmentByAppointmentNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveAppointmentByAppointmentNoResponse")
    public JAXBElement<RetrieveAppointmentByAppointmentNoResponse> createRetrieveAppointmentByAppointmentNoResponse(RetrieveAppointmentByAppointmentNoResponse value) {
        return new JAXBElement<RetrieveAppointmentByAppointmentNoResponse>(_RetrieveAppointmentByAppointmentNoResponse_QNAME, RetrieveAppointmentByAppointmentNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateServiceProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "rateServiceProvider")
    public JAXBElement<RateServiceProvider> createRateServiceProvider(RateServiceProvider value) {
        return new JAXBElement<RateServiceProvider>(_RateServiceProvider_QNAME, RateServiceProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "registerCustomer")
    public JAXBElement<RegisterCustomer> createRegisterCustomer(RegisterCustomer value) {
        return new JAXBElement<RegisterCustomer>(_RegisterCustomer_QNAME, RegisterCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputDataValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "InputDataValidationException")
    public JAXBElement<InputDataValidationException> createInputDataValidationException(InputDataValidationException value) {
        return new JAXBElement<InputDataValidationException>(_InputDataValidationException_QNAME, InputDataValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessCategoryNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "BusinessCategoryNotFoundException")
    public JAXBElement<BusinessCategoryNotFoundException> createBusinessCategoryNotFoundException(BusinessCategoryNotFoundException value) {
        return new JAXBElement<BusinessCategoryNotFoundException>(_BusinessCategoryNotFoundException_QNAME, BusinessCategoryNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidLoginException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "InvalidLoginException")
    public JAXBElement<InvalidLoginException> createInvalidLoginException(InvalidLoginException value) {
        return new JAXBElement<InvalidLoginException>(_InvalidLoginException_QNAME, InvalidLoginException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProviderByProviderIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProviderByProviderIdResponse")
    public JAXBElement<RetrieveServiceProviderByProviderIdResponse> createRetrieveServiceProviderByProviderIdResponse(RetrieveServiceProviderByProviderIdResponse value) {
        return new JAXBElement<RetrieveServiceProviderByProviderIdResponse>(_RetrieveServiceProviderByProviderIdResponse_QNAME, RetrieveServiceProviderByProviderIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewAppointmentEntityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "CreateNewAppointmentEntityException")
    public JAXBElement<CreateNewAppointmentEntityException> createCreateNewAppointmentEntityException(CreateNewAppointmentEntityException value) {
        return new JAXBElement<CreateNewAppointmentEntityException>(_CreateNewAppointmentEntityException_QNAME, CreateNewAppointmentEntityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "CustomerNotFoundException")
    public JAXBElement<CustomerNotFoundException> createCustomerNotFoundException(CustomerNotFoundException value) {
        return new JAXBElement<CustomerNotFoundException>(_CustomerNotFoundException_QNAME, CustomerNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "addAppointmentResponse")
    public JAXBElement<AddAppointmentResponse> createAddAppointmentResponse(AddAppointmentResponse value) {
        return new JAXBElement<AddAppointmentResponse>(_AddAppointmentResponse_QNAME, AddAppointmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "customerLoginResponse")
    public JAXBElement<CustomerLoginResponse> createCustomerLoginResponse(CustomerLoginResponse value) {
        return new JAXBElement<CustomerLoginResponse>(_CustomerLoginResponse_QNAME, CustomerLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerAppointments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveCustomerAppointments")
    public JAXBElement<RetrieveCustomerAppointments> createRetrieveCustomerAppointments(RetrieveCustomerAppointments value) {
        return new JAXBElement<RetrieveCustomerAppointments>(_RetrieveCustomerAppointments_QNAME, RetrieveCustomerAppointments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCustomerAppointmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveCustomerAppointmentsResponse")
    public JAXBElement<RetrieveCustomerAppointmentsResponse> createRetrieveCustomerAppointmentsResponse(RetrieveCustomerAppointmentsResponse value) {
        return new JAXBElement<RetrieveCustomerAppointmentsResponse>(_RetrieveCustomerAppointmentsResponse_QNAME, RetrieveCustomerAppointmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "cancelAppointment")
    public JAXBElement<CancelAppointment> createCancelAppointment(CancelAppointment value) {
        return new JAXBElement<CancelAppointment>(_CancelAppointment_QNAME, CancelAppointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveServiceProviderAppointments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "retrieveServiceProviderAppointments")
    public JAXBElement<RetrieveServiceProviderAppointments> createRetrieveServiceProviderAppointments(RetrieveServiceProviderAppointments value) {
        return new JAXBElement<RetrieveServiceProviderAppointments>(_RetrieveServiceProviderAppointments_QNAME, RetrieveServiceProviderAppointments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.session.ejb/", name = "addAppointment")
    public JAXBElement<AddAppointment> createAddAppointment(AddAppointment value) {
        return new JAXBElement<AddAppointment>(_AddAppointment_QNAME, AddAppointment.class, null, value);
    }

}
