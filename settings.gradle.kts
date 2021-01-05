rootProject.name = "example-microservices"

include("system:config-server")
include("system:service-registry-server")
include("system:gateway-service")

include("service:account-service:server")
