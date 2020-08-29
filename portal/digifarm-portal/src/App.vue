<template>
  <v-app>
    <router-view></router-view>
  </v-app>
</template>

<script>
export default {
  name: "App",
  components: {},
  data: () => ({})
};
</script>

<style lang="scss">
@import url("https://fonts.googleapis.com/css2?family=Montserrat:wght@300;600&display=swap");
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@400&display=swap");

#app,
#app .headline,
#app .overline {
  font-family: "Montserrat", Roboto, sans-serif !important;
}

.v-toolbar__title {
  font-family: "Poppins", Roboto, sans-serif !important;
}
</style>
