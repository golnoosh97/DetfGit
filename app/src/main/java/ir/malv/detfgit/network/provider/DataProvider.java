package ir.malv.detfgit.network.provider;


import ir.malv.detfgit.Rss;
import ir.malv.detfgit.network.RetrofitUtils;
import ir.malv.detfgit.network.request.Request;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * This class provides data for the activities.
 * I've added an example of how this is done.
 * But since there's no model to return it does nothing.
 * Don't use retrofit in activities.
 * Use this class instead.
 */
public class DataProvider {

    // TODO : Read the document above this class

    private static DataProvider dataProvider;

    private Retrofit retrofit;


    public static DataProvider getInstance() {
        if (dataProvider == null) {
            dataProvider = new DataProvider();
        }

        return dataProvider;
    }

    //********************************************************************

    public  void getRss(Callback<Rss>callback)
    {
        Request r=retrofit.create(Request.class);
        r.getRss().enqueue(callback);
    }


    // **************************************************************

    /**
     * We don't want anyone to new this. He/She must use {@link #getInstance()}
     */
    private DataProvider() {
        retrofit = RetrofitUtils.getInstance();
    }
}
