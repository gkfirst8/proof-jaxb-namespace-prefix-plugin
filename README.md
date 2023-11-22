# Questions

This repository should show the workings of the org.jvnet.jaxb:jaxb-plugins plugin in combination with the CFX plugin. Specifically the namespace prefix feature. (See/search for "urn:jaxb.jvnet.org:plugin:namespace-prefix")

At the time of this writing I notice that the namespace prefixes do get set as I expected. They all get set to the value for namespace ``http://types.theberlinbakery.com/v1_2`` which can be demonstrated by setting the desired prefix from "" to "x" in the file ``namespace-prefixes-order-service-1.2.1.xjb``.

# Conslusion

After studying the source-code of the plugin a bit I found that the binding can only have 1 prefix in it. This is more limited than Java imposes but it works for the current challenge so I'm happy for now

# Links

See also:
* https://github.com/highsource/jaxb-tools/wiki/JAXB-Tools-Migration-Guide
* https://github.com/highsource/jaxb-tools/wiki/JAXB2-Namespace-Prefix-Plugin
