package com.loudountutor.sophist.views;

import io.dropwizard.views.View;

import java.nio.charset.Charset;

public class BaseView extends View {
    protected BaseView(String templateName) {
        super(templateName, Charset.forName("utf-8"));
    }
}
