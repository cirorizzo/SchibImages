package cirorizzo.github.com.schibimages.model;

import android.support.annotation.NonNull;

public class ImagesURLsData {
    private static final String[] IMAGE_URLS = {
            "http://t1.gstatic.com/images?q=tbn:ANd9GcS0cjDhf5MPvwP-yjPWeAJMSsrAEbQoFeRQU78-B-F0fftw5OdBrwr4o1Uy",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcQob9105oHMBENJBgrmXmTCRSs14m8FVZfOf25WTN7lO3qT-GJs6N_YXG7G",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcRbm05Y2f6R4q9apNggsKZ5gLpbnkaeENis609zG_9RPq6t0gQ8jeoMW6-w",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcTwe8tovwf3oZDDI3C6NVSEQ51jUP2FXjoajqBmJeTCoQ6avOMlfqbLny1d",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcR5Rizfj-r_C3DbB8QLBvNo57OAZYqdUsgAYquYOuM44_vzyRctKUhZReTW",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcTFIR5hoxegrBnJk9tr4KHay56t-v4IQdvszDi8xepp_nvuRGl9dhLhvW79",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcSHUXhN8i5bb1J-nn_nhzx7HLlyopLPGxb4ljnbEvQu-sl7zS_mTGtsaoUc",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcT1f-BwhNxzvy2aHcGLxY-eGwYN_liLnCMFi7VkAHKL53lokLa_2i_uUZgZ",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcRtjCQ8jbhxR44lHaeslufD94AZZpYsxnK4NPH1jQOljxjINpv--rMlX8o",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcR4DwUYYvZIFSxTAPerPeuR45tg6AQt0l_kiEOYUkLgbfmcZD3kdZYG9cy-",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQwvZt7O7mx3taXQHkASiTWwl91_PemHiiupDB_tMgpaeX4MrthCuE-U_I",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcToxJziLymluxjsK0oUb2azGdFDUnL6NsFeKHg3kzB_FwL8dc-HLGDVZFtU",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcRoQMHOYAWxFfrQ_hP8jVuXU90G_Wup7l5mo7Six5FBLbYNau189DzlyYc",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSCuEy3gBkcFVEY96NzbycHtNbzGopa-wGtYnvOJIEubGSWaLR8VHqFzQI",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcTxUrzqsmnc-06JFJjkadO0aGUpKu_TuatbYZUEKc6rZ0TGi6XhEbdzb0hO",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQnf6byUH0qXdnFkW0WqbHQ9bDloyewJpALYLDE_RDpNLeYHQbb5U3pm3wK",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcTgiWvmvR-2-PnAnqmbPgyPWq_0jTF2R95xkOjMJzMoUVUHIS45glM6tr7f",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcRPU0tlfXYtEy_Aza0BBuPslJTg8j_I36JAeX1lnKVgeFPUrD7bcowFhNE",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcTq8hAbOq6A8rUVGxAWtlJ9RgYd5XoNpwg5oL5HzxnwxSnnGkF4sJJYpDfs",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQNsuaRqFXTBinmERprbOQni8152S_0FUdhyLkw2rxKE2QRNiry6tcvKI7t",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcQwMv28IpTyk5EV6SszSRz911YB4FhLcJOmpWcms3YBHrQqa-vrm8E51Bpy",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcR3Z0ks4pL2N1Be65-cWWL5Rfi7kMIKM6jgJ7_Ml2Mn3TM8kdmg_YkEc6pf",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcSirBOsxwnFt7XACWqwtpOWvVZXxxP0HlRd1o5eUUBC_6IXOfxZF-A8dnxV",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcRva4abXsc0xIGsiDkKQ3-e7Y1gHW-mwwZK-QCBAtTmVdXn_4njD4OL7bf9",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcTrSOX_8Z2UmtVRk26NOhrtjl2FUlXWMy23rF_IPkQf8QOgydfo3dHxRlog",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcQ2oaDdH31p-9aYOS09-qRTjyLgD_QC_rNoUZ0pM9PAA-e4ad0s2Rf0Eg",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcSeanhVrrNNMjPdbuV2bw-289930k1yXD_iXFjqZebKb8Dh9gg6SC1Sydtg",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcT210fxmue0NXcXL5JerTBXXf3RzYKIh0QDPuwT5SJR_YYsL3cbn2Fq9dC0",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQ2OQNN4m7kLmcPR00NJDuwc-u4FEerk3TELUTuiFy2iGVXx3vXttVhALum",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcSG6c5KiuHyvRRWxBy44sdf-giWCJuef4RT12FnjzsFOWyUC6_lv_z928bN",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcQxT9HQnBkU7NwlBqXYkKXcGw90t7Sb72NXLfYwlCv4PC9XBiJSjGushCE",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQ-16r-_MmYalzLDjjeVI79KagFRoypiZSS9ozCTL654qEadwV-SbtsJuCm",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcS-uZsF_jUE-I_xXM9zWtC6GUNjNyR1PgjTiGIKyZqj7-kFiwrGcoG_CR8",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcSYW2Y0Hsu0bDVhgbcO4LoAJ2K65jR4tO3WxYzE1YSwCN2LdwDxZ-kXh8w",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQrXVHacYIjm433h4-ZEjceMPyoNBag9tSmv843A7BOWZckIp4fMjjOOpY6",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQAKKaqiaGkFxSfyuvMQjxpu6w_jbDdPJCzayVIrffWjRDkF7ZG5zeMYzzV",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQ5hEqLE2tRR7h2uBEJdMTC-bI4n3YPq3_a1tTSoPVqjql6meFND9VmBks",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcT0eBDir9U2bDFT0pY6xRWfgQCxrAzQFqZMlR9INcp9jvCfQmBOI-SBIPM",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcRkGqPkc4mEEA-DUCvW9w8Pq0O46nsnWJFhStI4Czb8ikxQ4WqFkSxyerpS",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSz4sv2HzeWqES4QuTQDqWsThWMb1KzLyECfGQMWnvq1CCj6diqcz8nPtM",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcRE2vIC9Nj3YzPdLMO4n9LGx14pm3rVwJvWWPLWA1t3bnFQ8NeMGkaMJds",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcSA75ZbxjqwQj8E9kGi8wue4rCJ1jAz7b79tex5gPIVlYOxN5q59Z9m75A3",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQTZagfwTkB81yJioTRc899WYDAiKu7pj27bSZ79XOEvLhXuwxlRXYjSHg",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcTtpy5UgW0jN3X_FH6q-oaEQZ15P4eSORxbAkbQvE7NdAAKDiiLDDz1SqVl",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcTDFswBeZqzAFTw5UTicaeUMuk_YHCSzyrtJsACWWjdNiOZYUn3-fr5G-A",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcThZmwWm8fQ0AyOWv8zGbnugG13ZIrzTjhH91B9RODmBqQZMJ7TLOrNP4VY",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQ6qMeQ1bhf7_FE6EgKNxwR1WUhzOXwDg1ddvan9UN_bmnJl7W5RcY9mcUy",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcRCxY0NvFXWNF_Z02brPxwLNviuxkxd2Z6tUPtqJI_nuJuZg4HbVM7v6HoC",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcSXoMU3sLxpuuO2k26BWwn0YwBO0vC5waonjnPfJr0Z8fR2hltq3dsRfz4u",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcRzpvNYWKQCCbFeUqgnOuMkdN8Y5XPsTc1JMw62BamXPZz8lItVAL5kAgc",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcTYeC0chL5TdTZXZc8xvxpHqu9hfS-qE-GBWBbKKewOeO4XlXgwUJzzoVDC",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcSJR4ZozWrUI6aL6HcwjNayrJe522ASyjqM1MHK20Vk9PHDUJVGHspYZCnN",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcQgSepaaYYYxOE4t0xQkdGTg0QW6nkqx-NjTBA-LwnT90L19edBpQZRi5US",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcTYsgqxGhcci4IzZE1SPGRbHlf6hstLNcsmK5x5SR0KkeU78SmpKYJOfE0",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSdzwjnKTszX3RKF9GwUoyyohkVdzyatEwrQbKk9wcAc_HolL6JR7UGnqs",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcTPe41YFXLreGlkWy59cpuO0zFBJT6jafAqW9RfryXY9GVQf1alJ0y9p-c",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcQweW8gMu4kIP4nG0TFsLZoCxgf1Z9J-_JNmBiZ0wWmlVHEv3Y5gdlaMaQ",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcRPYFe1QOZv_8Kzpm91iWuXxUQeKMz5pwxjwOUfKAf_mOflQguJMt_2c2E",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcRBk6h3q7mTCFYzajEeIMcSks1Ip5zSZH2WbDQIzPALFK6VgeV3KHFHepxX",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcQB239lBYbGj0q-xbJDiAeHkloM3hV_ndbp51h8THaabhP38Y_j-cNWNeQ",
            "http://t3.gstatic.com/images?q=tbn:ANd9GcSHLp7AdywiwUWthCytWwKWwWGTftgAhW0VxjXRYpiHrSllVw6VOULi1xkQ",
            "http://t1.gstatic.com/images?q=tbn:ANd9GcSA0E46vEqJHqqjMT9TUHOAPHiU9JogRHnHl0sb1qQ4UwOhoU9SIC0VCF",
            "http://t2.gstatic.com/images?q=tbn:ANd9GcTG37jSplgkJXDypA5aY_nxIkR6ucTtsJfeExsuYNjh34Bu72cbuoHuY_M",
            "http://t0.gstatic.com/images?q=tbn:ANd9GcSy3hdtaKNWke9UxJprF2IaxyTQPD1J32xElYoOnm-GOznIiW2K8p3KjHTm"
    };

    public int getSize() {
        return IMAGE_URLS.length;
    }

    public String getImageURL(@NonNull int position) {
        return ((position >= 0) && (position < IMAGE_URLS.length)) ? IMAGE_URLS[position] : null;
    }
}
