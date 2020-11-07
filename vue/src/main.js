import Vue from 'vue'
import App from './App.vue'
import { router } from './routes.js'
import { store } from './store/store.js'
import vuetify from './plugins/vuetify';
import VueTypedJs from './plugins/vuetypedjs'

Vue.config.productionTip = false;

new Vue({
    router,
    store,
    vuetify,
    VueTypedJs,
    render: h => h(App)
}).$mount('#app')
