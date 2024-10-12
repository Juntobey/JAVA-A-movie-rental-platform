package rentals.com;

import com.google.gson.Gson;

public class LoginResponse {
    private boolean success;
    private String message;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}

