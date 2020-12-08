
# Proxy

**Goal:**
---

- provides a substitute for another object ( stubs )
- proxies delegate all of their work to another object.

**Pros**
---

- we can control the service object without the clients knowing about it.
- we can change the service object without changing the backend object or client code.

**Cons:**
---

- Code may become more complicated.
response time may increase due to the extra communication time between the backend object and the proxy.

**JDK Use**
---

- `java.lang.reflect.Proxy` - creates Proxy instances of Interfaces.
- `java.rmi.*`