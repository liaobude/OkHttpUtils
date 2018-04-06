package com.xwdz.okhttpgson.callback;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * @author 黄兴伟 (xwd9989@gamil.com)
 * @since 2018/4/6
 */
public abstract class StringCallBack extends AbstractCallBack<String> implements ICallBack {

    @Override
    protected String parser(Call call, Response response) throws IOException {
        final String result = response.body().string();
        onSuccess(call, result);
        return result;
    }

    public abstract void onSuccess(Call call, String response);
}
