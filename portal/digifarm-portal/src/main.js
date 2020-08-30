import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import vuetify from "./plugins/vuetify";

import axios from "axios";

require("@/store/subscriber");

import "material-design-icons-iconfont";
import "./registerServiceWorker";

Vue.config.productionTip = false;

axios.defaults.baseURL = "https://www.catholicmusic.or.ke:8099/kcm/api/";

//axios.defaults.baseURL = "http://localhost:8083/digi/api/";

store.dispatch("auth/attempt", localStorage.getItem("token")).then(() => {
  new Vue({
    router,
    store,
    vuetify,
    render: h => h(App)
  }).$mount("#app");
});
