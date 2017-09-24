module com.zyxist.example.dagger.framework.core {
    exports com.zyxist.example.dagger.framework.core.api;
    exports com.zyxist.example.dagger.framework.core.di;
    exports com.zyxist.example.dagger.framework.core.impl;

    requires dagger;
    requires javax.inject;
}