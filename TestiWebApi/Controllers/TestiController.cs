using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TestiWebApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TestiController : ControllerBase
    {
        [HttpGet]
        [Route("")]
        public string Hello()
        {
            return "Hello World!";
        }

    }
}
