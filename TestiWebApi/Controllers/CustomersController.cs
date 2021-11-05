using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TestiWebApi.Models;

namespace TestiWebApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CustomersController : ControllerBase
    {
        [HttpGet]
        [Route("")]
        public List<Customer> AllCustomers()
        {
            NorthwindContext context = new();
            List<Customer> allCustomers = context.Customers.ToList();
            return allCustomers;
        }
    }
}
