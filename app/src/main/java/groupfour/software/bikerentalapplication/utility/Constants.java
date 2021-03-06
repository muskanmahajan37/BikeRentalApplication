package groupfour.software.bikerentalapplication.utility;

public class Constants {
    /* API Server */
    public static final String IPSERVER = "https://csl456-bike-rental-app.herokuapp.com";

    /* API URLs */
    public static final String LOCATION                  = "/location";
    public static final String CYCLE                     = "/cycle";
    public static final String CHANGE_LOCATION           = "/changeLocation";
    public static final String PERSON                    = "/person";
    public static final String COMPLAINTS                = "/complaint";
    public static final String USER                      = "/user";
    public static final String RIDE                      = "/ride";
    public static final String RIDE_START                = "/start";
    public static final String RIDE_END                  = "/end";
    public static final String SESSION                   = "/session";
    public static final String VALIDATE_REGISTRATION_OTP = "/validateRegistrationOTP";
    public static final String VALIDATE_FORGOT_PASS_OTP  = "/validateForgotPassOTP";
    public static final String CHANGE_PASS               = "/changePass";
    public static final String FORGOT_PASS               = "/forgotPass";

    /* Stored */
    public static final String PREFERENCES = "shared";

    public static final String STORED_ID           = "ID";
    public static final String STORED_USERNAME     = "USERNAME";
    public static final String STORED_EMAIL        = "EMAIL";
    public static final String STORED_ACCESS_TOKEN = "ACCESS_TOKEN";
    public static final String STORED_ROLE         = "ROLE";
    public static final String STORED_PERSON_ID    = "PERSON_ID";

    /* App Permissions */
    public static final int REQUEST_MAP_PERMISSIONS   = 1;
    public static final int REQUEST_CAMERA_PERMISSION = 2;
}
