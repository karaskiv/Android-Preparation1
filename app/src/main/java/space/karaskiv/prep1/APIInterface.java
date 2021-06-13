package space.karaskiv.prep1;

import retrofit2.Call;
import space.karaskiv.prep1.pojo.MultipleResource;
import space.karaskiv.prep1.pojo.User
import space.karaskiv.prep1.pojo.UserList

import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
